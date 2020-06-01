package com.lz;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.lz.util.*;

public class Util
{
 private static final String LOCAL_PATH="D:/test/";
 
 private static int FLAG = 0;
 

    
    public static BufferedImage cutScreem(int[] ltwh, Robot robot,boolean saveLocal)
    {
        BufferedImage image = robot.createScreenCapture(new Rectangle(ltwh[0], ltwh[1], ltwh[2], ltwh[3]));
        if(saveLocal)
        {
            try
            {
                ImageIO.write(image, "png", new File(LOCAL_PATH+DateUtil.getDefaultCurrentTime()+"_"+ FLAG++ +".png"));
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        return image;
    }
    
    
    
    public static void dragToLeft(Robot robot,int[] mobilLtwh)
    {
        int[] startPoint= {mobilLtwh[0]+mobilLtwh[2]/2,mobilLtwh[1]+mobilLtwh[3]/2};
        MouseUtil.dragToLeft(robot, startPoint);
    }
    
    public static void dragToRight(Robot robot,int[] mobilLtwh)
    {
        int[] startPoint= {mobilLtwh[0]+mobilLtwh[2]/2,mobilLtwh[1]+mobilLtwh[3]/2};
        MouseUtil.dragToRight(robot, startPoint);
    }
    
    public static void dragToDown(Robot robot,int[] mobilLtwh)
    {
        
        int[] startPoint= {mobilLtwh[0]+mobilLtwh[2]/2,mobilLtwh[1]+mobilLtwh[3]/2};
        MouseUtil.dragToDown(robot, startPoint);
    }
    
    public static void dragToTop(Robot robot,int[] mobilLtwh)
    {
        
        int[] startPoint= {mobilLtwh[0]+mobilLtwh[2]/2,mobilLtwh[1]+mobilLtwh[3]/2};
        MouseUtil.dragToTop(robot, startPoint);
    }
    
    public static void main(String[] args) throws AWTException
    {
        Robot robot = new Robot();
        robot.setAutoDelay(2);
        int[] start= {100,100};
        dragToRight(robot,start);
        
    }
    
//    public static 
    
    public static int[] getMobilScreem() {
        return null;
    }
    
}
