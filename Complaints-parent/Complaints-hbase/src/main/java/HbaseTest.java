
import java.io.IOException;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

public class HbaseTest {
    static org.apache.hadoop.conf.Configuration configuration=null;
    private org.apache.hadoop.hbase.client.Connection connection=null;
    private Table table=null;
    public static Admin admin;
    

    public void init() throws Exception{
        configuration=HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.quorum", "127.0.0.1");
        configuration.set("hbase.zookeeper.property.clientPort", "2181");// zookeeper�˿�
        connection=ConnectionFactory.createConnection(configuration);
        admin = connection.getAdmin();
    }
    public void queryall(String tableName) throws Exception{
        table = connection.getTable(TableName.valueOf(tableName));
        ResultScanner rs = table.getScanner(new Scan());
        int num=0;
        for (Result r : rs) {
        num++;
    }
            System.out.print(num);
    }
public void checkColName(String tableName,String rowkey,String exceptedColName) throws Exception{
    table = connection.getTable(TableName.valueOf(tableName));//����hbase������
    Get scan = new Get(rowkey.getBytes());//��ȡrokey������ת���byte�ֽ�
    Result r=table.get(scan);//ʹ��ת���rowkey��ѯ�������ѯ������ظ�Result
    System.out.println("1");
    if(r.rawCells().equals("")||r.rawCells()==null||r.rawCells().length==0){
        System.out.println("3");
    }
    for (Cell keyValue : r.rawCells()) {
        System.out.println("2");
        String colName = Bytes.toString(keyValue.getQualifierArray(),keyValue.getQualifierOffset(),keyValue.getQualifierLength());
        if(!colName.equals(exceptedColName)){
            System.out.println("У��ɹ�,������colName��"+exceptedColName+",ʵ��colName:" + colName);
        }else if(colName.isEmpty()){
            System.out.println("У��ɹ�����ѯ��colName");
        }else{
            System.out.println("У��ʧ��");
        }
        System.out.println("12:"+keyValue.getFamilyLength());

    }
}
/**
 * �鿴���б�
 * @throws IOException
 */
public static void listTables() throws IOException {
    //
    HTableDescriptor hTableDescriptors[] = admin.listTables();
    for(HTableDescriptor hTableDescriptor :hTableDescriptors){
        System.out.println(hTableDescriptor.getNameAsString());
    }
    //close();
}
public  boolean createTable(TableName tableName, String[] columns) {
    boolean result=false;
    try{
      
        if (admin.tableExists(tableName)) {
            System.out.println("���Ѿ����ڣ�");
            result=false;
        } else {
            HTableDescriptor desc = new HTableDescriptor(tableName);
            for (String column : columns) {
                desc.addFamily(new HColumnDescriptor(column));
            }
            admin.createTable(desc);
            System.out.println("�����ɹ���");
            result=true;
        }
    }catch(Exception e){
        result=false;
        e.printStackTrace();
    }

    return result;
}
public static void main(String[] args) throws Exception{
    HbaseTest hl=new HbaseTest();
    hl.init();
    hl.listTables();
   
    String[] columns=new String[]{"id","name"};
//    hl.createTable(TableName.valueOf("info_user"),columns);
}
}