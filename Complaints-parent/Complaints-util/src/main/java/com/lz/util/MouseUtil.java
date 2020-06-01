package com.lz.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseUtil
{
    
    private static int MOVE_LENGTH=40;
    
    public static void dragToLeft(Robot robot,int[] startPoint)
    {
        robot.mouseMove(startPoint[0], startPoint[1]);
        
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseMove(startPoint[0]-MOVE_LENGTH, startPoint[1]);   
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    
    public static void dragToRight(Robot robot,int[] startPoint)
    {
        robot.mouseMove(startPoint[0], startPoint[1]);
        
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseMove(startPoint[0]+MOVE_LENGTH, startPoint[1]);   
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    
    public static void dragToDown(Robot robot,int[] startPoint)
    {
        
        robot.mouseMove(startPoint[0], startPoint[1]);    
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseMove(startPoint[0], startPoint[1]+MOVE_LENGTH);   
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    
    public static void dragToTop(Robot robot,int[] startPoint)
    {
        
        robot.mouseMove(startPoint[0], startPoint[1]);    
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseMove(startPoint[0], startPoint[1]-MOVE_LENGTH);   
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    
    public static void main(String[] args) throws AWTException
    {
        Robot robot = new Robot();
        robot.setAutoDelay(2);
        int[] start= {100,100};
        dragToRight(robot,start);
        
    }
    
    public static void clickPosition(Robot robot,int[] position)
    {
        robot.mouseMove(position[0], position[1]);    
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}
