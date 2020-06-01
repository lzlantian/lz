
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
        configuration.set("hbase.zookeeper.property.clientPort", "2181");// zookeeper端口
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
    table = connection.getTable(TableName.valueOf(tableName));//建立hbase表链接
    Get scan = new Get(rowkey.getBytes());//获取rokey，将其转义成byte字节
    Result r=table.get(scan);//使用转义的rowkey查询表，将其查询结果返回给Result
    System.out.println("1");
    if(r.rawCells().equals("")||r.rawCells()==null||r.rawCells().length==0){
        System.out.println("3");
    }
    for (Cell keyValue : r.rawCells()) {
        System.out.println("2");
        String colName = Bytes.toString(keyValue.getQualifierArray(),keyValue.getQualifierOffset(),keyValue.getQualifierLength());
        if(!colName.equals(exceptedColName)){
            System.out.println("校验成功,不存在colName："+exceptedColName+",实际colName:" + colName);
        }else if(colName.isEmpty()){
            System.out.println("校验成功，查询无colName");
        }else{
            System.out.println("校验失败");
        }
        System.out.println("12:"+keyValue.getFamilyLength());

    }
}
/**
 * 查看所有表
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
            System.out.println("表已经存在！");
            result=false;
        } else {
            HTableDescriptor desc = new HTableDescriptor(tableName);
            for (String column : columns) {
                desc.addFamily(new HColumnDescriptor(column));
            }
            admin.createTable(desc);
            System.out.println("表创建成功！");
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