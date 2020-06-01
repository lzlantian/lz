    package com.lz;

import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Test
{
    
//    private static final  int[] COMPARE_RGB = {0,0,0};
    private static final  int[] COMPARE_RGB = {150,150,150};
    
    public static void main(String[] args) throws IOException, InterruptedException
    {
        getScreem();
//        testPic();
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
           
            int x=160;
            int y =280;
            int flag=0;
            long sleep =220;
            boolean isStart = false;
            int[] sleepArr= {220,210,205,200,190};
            int count =0;
           while(i++<500)
           {
               try
               {
                   int[] read= {mobilLtwh[0]+160,mobilLtwh[1]+300,40,40};
                   BufferedImage bi= Util.cutScreem(mobilLtwh, robot, true);
//                   Util.cutScreem(read, robot, true);
                   
//                   Util.cutScreem(read, robot, true);
//                   int  pixel = bi.getRGB(x, y); // 下面三行代码将一个数字转换为RGB数字
//                   rgb[0] = (pixel & 0xff0000) >> 16;
//                   rgb[1] = (pixel & 0xff00) >> 8;
//                   rgb[2] = (pixel & 0xff);
                   Util.dragToDown(robot, mobilLtwh);
                   
                   if(isY(getRgb(bi,x,y)) && (isY(getRgb(bi,x,y+5))||isY(getRgb(bi,x,y-5))))
                   {
                      
                       Util.dragToDown(robot, mobilLtwh);
                       
//                       System.out.println(i+" down");
                   }else if(isB(getRgb(bi,x,y)) && (isB(getRgb(bi,x,y+5))||isB(getRgb(bi,x,y-5))))
                   {
                      
                       Util.dragToLeft(robot, mobilLtwh);
//                       x=220;
//                       System.out.println(i+" left");
                   }else if(isR(getRgb(bi,x,y)) && (isR(getRgb(bi,x,y+5))||isR(getRgb(bi,x,y-5))))
                   {
                   
//                       x=160;
                       Util.dragToRight(robot, mobilLtwh);
//                       System.out.println(i+" right");
                   }else
                   {
                       
                       Thread.sleep(30);
//                       System.out.println("no");
                       continue;
                   }
//                   System.out.println("yes");
                   if(isStart && flag>12)
                   {
                       System.out.println("减时间次数："+ (++count));
                       sleep=sleep-10;
                   }
                   
                  
                   Thread.sleep(sleep);
                   
                   
                   
                   
                   
               }
               catch (Exception e)
               {
                 
                   // TODO Auto-generated catch block
                   throw e;
               }
               
               
           }
            
//            Util.cutScreem(mobilLtwh, robot, true);
//            Util.dragToDown(robot, mobilLtwh);
//            Util.dragToLeft(robot, mobilLtwh);
//            Util.dragToRight(robot, mobilLtwh);
//            Util.dragToTop(robot, mobilLtwh);
//            recordPic(mobilLtwh,robot);
            
            
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
        for(int i=3;i<=24;i++)
        {
            BufferedImage bi=ImageIO.read(new File("D:/test/test/2019-10-17_"+i+".png"));
            int  pixel = bi.getRGB(160, 350); // 下面三行代码将一个数字转换为RGB数字
            rgb[0] = (pixel & 0xff0000) >> 16;
            rgb[1] = (pixel & 0xff00) >> 8;
            rgb[2] = (pixel & 0xff);
            
            if(isY(rgb))
            {
                System.out.println("down");
            }else if(isB(rgb))
            {
                System.out.println("left");
            }else if(isR(rgb))
            {
                System.out.println("right");
            }else
            {
                Thread.sleep(20);
                System.out.println("no");
                continue;
            }
            Thread.sleep(150);
        }
       
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
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public static boolean isY(int[] rgb)
    {
        return rgb[0]>230 && rgb[1] >230 && rgb[2] >80;
    }
    
    public static boolean isB(int[] rgb)
    {
        return rgb[0]<200 && rgb[1] <200 && rgb[2] >230;
    }
    
    public static boolean isR(int[] rgb)
    {
        return rgb[0]>230 && jueduizhi(rgb[1]-100)<20 && jueduizhi(rgb[2]-100)<20;
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
