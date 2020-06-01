package com.lz.demo.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.lz.demo.service.ServiceDemo;

@Controller
@RequestMapping(value = "/file")
public class FileUploadRest 
{
    @Autowired
    private ServiceDemo service;

    @RequestMapping(value="/fileUpLoad")
    @ResponseBody
    public String testUpload(HttpServletRequest request,@RequestParam("files") MultipartFile[] files) throws Exception{
        ServletContext servletContext = request.getServletContext();//获取ServletContext的对象 代表当前WEB应用
        String realPath = servletContext.getRealPath("/uploads");//得到文件上传目的位置的真实路径
        System.out.println("realPath :"+realPath);
        File file1 = new File(realPath);
        if(!file1.exists()){
            file1.mkdir();   //如果该目录不存在，就创建此抽象路径名指定的目录。 
        }
        String prefix = UUID.randomUUID().toString();
        prefix = prefix.replace("-","");
        for(MultipartFile file:files)
        {
            String fileName = prefix+"_"+file.getOriginalFilename();//使用UUID加前缀命名文件，防止名字重复被覆盖
            
            InputStream in= file.getInputStream();;//声明输入输出流
            
            OutputStream out=new FileOutputStream(new File(realPath+"\\"+fileName));//指定输出流的位置;
            
            byte []buffer =new byte[1024];
            int len=0;
            while((len=in.read(buffer))!=-1){
                out.write(buffer, 0, len);
                out.flush();                //类似于文件复制，将文件存储到输入流，再通过输出流写入到上传位置
            }                               //这段代码也可以用IOUtils.copy(in, out)工具类的copy方法完成
                                            
            out.close();
            in.close();
        }
        
    
        return "success";
    }
    @RequestMapping("/fileDownLoad")
    public ResponseEntity<byte[]> fileDownLoad(HttpServletRequest request) throws Exception{
     
      ServletContext servletContext = request.getServletContext();
      String fileName=request.getParameter("fileName");
      String realPath = servletContext.getRealPath("/uploads/"+fileName);//得到文件所在位置
        InputStream in=new FileInputStream(new File(realPath));//将该文件加入到输入流之中
         byte[] body=null;
         body=new byte[in.available()];// 返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余字节数
         in.read(body);//读入到输入流里面
        
        fileName=new String(fileName.getBytes("gbk"),"iso8859-1");//防止中文乱码
        HttpHeaders headers=new HttpHeaders();//设置响应头
        headers.add("Content-Disposition", "attachment;filename="+fileName);
        HttpStatus statusCode = HttpStatus.OK;//设置响应吗
        ResponseEntity<byte[]> response=new ResponseEntity<byte[]>(body, headers, statusCode);
        return response;

    }
}
