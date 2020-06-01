    package com.lz;

import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Test2
{
    
//    private static final  int[] COMPARE_RGB = {0,0,0};
    private static final  int[] COMPARE_RGB = {150,150,150};
    
    public static void main(String[] args) throws IOException, InterruptedException
    {
//       getScreem();
        testPic();

    }
    
    private static void getScreem()
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        System.out.println(screenWidth+"  "+screenHeight);
        int[] ltwh= {0,0,screenWidth,screenHeight};
        
        int [] mobilLtwh = {1003,40,360,640};
        Robot robot;
        try
        {
            robot = new Robot();
            BufferedImage screem= Util.cutScreem(ltwh, robot, true);
           int[] rgb=new int[3];
            int i=0;
           
           while(i++<1)
           {
               try
               {
                 
                  
                   Thread.sleep(300);
                      
                   
               }
               catch (Exception e)
               {
                 
                   // TODO Auto-generated catch block
                   throw e;
               }
               
               recordPic(mobilLtwh,robot);
           }
            
            
            
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
    
    private static int[] getRgb(BufferedImage bi,int x,int y)
    {
        int[] rgb=new int[3];
        int  pixel = bi.getRGB(x, y); // 下面三行代码将一个数字转换为RGB数字
        rgb[0] = (pixel & 0xff0000) >> 16;
        rgb[1] = (pixel & 0xff00) >> 8;
        rgb[2] = (pixel & 0xff);
        return rgb;
    }
    
    public static void testPic() throws IOException, InterruptedException
    {
        int[] rgb=new int[3];

            BufferedImage bi=ImageIO.read(new File("D:/test/2019-11-26_5.png"));
            
            int[] startPoint=new int[2];
            
            boolean flag = true;
            for(int i=30;i<bi.getWidth() &&flag;i+=2)
            {
                for(int j=50;j<bi.getHeight();j+=2)
                {
                    if(isY(bi,i,j))
                    {
                        if(isY(bi,i+10,j) && isY(bi,i+20,j))
                        {
                            startPoint[0]=i;
                            startPoint[1]=j;
                            flag=false;
                            break;
                        } else if(isY(bi,i,j+10) && isY(bi,i,j+20))
                        {
                            startPoint[0]=i;
                            startPoint[1]=j;
                            flag=false;
                            break;
                        }
                    }
                }
            }
            
            if(flag)
            {
                System.out.println("未找到起点");
                return;
            }
            int[] endPoint=new int[2];
            if(isY(bi,startPoint[0]+10,startPoint[1])) { //横向
                for(int i=startPoint[0];i<bi.getWidth() ;i+=5)
                {
                    if(!isY(bi,i+10,startPoint[1]))
                    {
                        endPoint[0]=i;
                        endPoint[1]=startPoint[1];
                        break;
                    }
                }
            }else if(isY(bi,startPoint[0],startPoint[1]+10)) { //纵向
                for(int i=startPoint[1];i<bi.getHeight() ;i+=5)
                {
                    if(!isY(bi,startPoint[0],i+10))
                    {
                        endPoint[0]=startPoint[0];
                        endPoint[1]=i;
                        break;
                    }
                }
            }
            
           System.out.println("起点："+startPoint[0]+"  "+startPoint[1]);
           System.out.println("终点："+endPoint[0]+"  "+endPoint[1]);
            
       
    }
    
    
    private static boolean compareRGB(BufferedImage bi ,int x,int y) throws Exception
    {
        int[] rgb=new int[3];
        int pixel=0;
        try
        {
            
            pixel = bi.getRGB(x, y); // 下面三行代码将一个数字转换为RGB数字
            rgb[0] = (pixel & 0xff0000) >> 16;
            rgb[1] = (pixel & 0xff00) >> 8;
            rgb[2] = (pixel & 0xff);
        }
        catch (Exception e)
        {
            System.out.println(x+"-"+y);
            // TODO Auto-generated catch block
            throw e;
        }
        int piancha=20;
        
        return (jueduizhi(rgb[0]-COMPARE_RGB[0]) <piancha && jueduizhi( rgb[1]-COMPARE_RGB[1])<piancha && jueduizhi(rgb[2]-COMPARE_RGB[2])<piancha);
        
    }
    
    private static int jueduizhi(int param)
    {
        return param>=0?param:param*-1;
    }
    
    
    public static void recordPic(int[] mobilLtwh,Robot robot) 
    {
        int i=0;
        while(i++<100)
        {
            Util.cutScreem(mobilLtwh, robot, true);
            
            try
            {
                Thread.sleep(300);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public static boolean isY(BufferedImage bi,int x,int y)
    {
        int[] rgb=new int[3];
        int pixel=0;
        try
        {
            
            pixel = bi.getRGB(x, y); // 下面三行代码将一个数字转换为RGB数字
            rgb[0] = (pixel & 0xff0000) >> 16;
            rgb[1] = (pixel & 0xff00) >> 8;
            rgb[2] = (pixel & 0xff);
        }
        catch (Exception e)
        {
            System.out.println(x+"-"+y);
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return jueduizhi(rgb[0]-237)<5 && jueduizhi(rgb[1]-167)<5 && jueduizhi(rgb[2]-70) <5;
    }
    
   
    
    public static void findFangkuang()
    {/*
        for (int i = 0; i < screenWidth-15; i++) 
        {
            for (int j = 0; j < screenHeight-15; j++) 
            {
               
               
                
                if(compareRGB(screem,i,j) && compareRGB(screem,i+50,j)) {
                    mobilLtwh[0]=i;
                    mobilLtwh[1]=j;
                    break;   
                }   
            }
        }
        
        
        for(int i=mobilLtwh[0];i<screenWidth;i++)
        {
            if(compareRGB(screem,i,mobilLtwh[1]) && compareRGB(screem,i,mobilLtwh[1]+50))
            {
                mobilLtwh[2]=i-mobilLtwh[0];
                break;
            }
        }
        
        for(int j=mobilLtwh[1];j<screenHeight-5;j=j+5)
        {
            if(!compareRGB(screem,mobilLtwh[0],j))
            {
                mobilLtwh[3]=j-mobilLtwh[1];
                break;
            }
        }
        System.out.println(mobilLtwh[0] +" "+mobilLtwh[1] +" "+mobilLtwh[2] +" "+mobilLtwh[3] +" ");
        
        Util.cutScreem(mobilLtwh, robot, true);
    */}
    
    
    
}
