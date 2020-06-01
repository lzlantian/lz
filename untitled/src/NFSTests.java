import java.io.File;
        import java.io.FileFilter;
        import java.io.IOException;

        import com.sun.nfs.XFileExtensionAccessor;
        import com.sun.xfile.*;
        import net.sf.jftp.system.logging.Log;

        import java.io.*;
        import java.util.ArrayList;
        import java.util.List;

/**
 * Created by fd on 2017/8/14.
 */
public class NFSTests {
    String url;
    XFile xfile;
    public void NFSconnection(String ip,String dir)
    {
        url = "nfs://" + ip + "/" + dir;//创建连接
        xfile = new XFile(url);
        System.out.println(url);
        //调用exists()判断是否连接成功
        if (xfile.exists()) {
            System.out.println("URL is OK!");
        } else {
            System.out.println("URL is Bad!");
            return;
        }

    }
    public void coming(String pathname) throws IOException {
        String path[] = pathname.split("/");//切割，如果服务器是unix系统，更改为"\"
        String[] fileList = new String[1024];//设置接收目录扫描的长度，暂时设置为1024
        fileList = xfile.list();//缺少这一句的话，会出现找不到文件的错误
        XFile temp;
        XFileInputStream in = null;
        for(String splittext:path){
            url = url+"/"+splittext;
            temp = new XFile(url);
            in = new XFileInputStream(temp);
            fileList = temp.list();
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(in,"GBK"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) throws IOException {
        String ip ="106.52.181.49";
        String dir = "home/lztest";
        NFSTests nfs = new NFSTests();
        nfs.NFSconnection(ip,dir);
        nfs.coming("test.txt");
    }
}