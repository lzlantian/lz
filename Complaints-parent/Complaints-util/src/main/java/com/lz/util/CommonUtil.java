package com.lz.util;

import java.io.Closeable;
import java.io.IOException;
import java.security.SecureRandom;

import org.apache.log4j.Logger;

public class CommonUtil {
	
    private static final Logger LOGGER = Logger.getLogger(CommonUtil.class);
    
	public static void closeStream(Closeable... objs)
	{
	    if(objs != null && objs.length>0)
	    {
	        for(Closeable temp: objs)
	        {
	            if(temp != null)
	            {
	                try
                    {
                        temp.close();
                    }
                    catch (IOException e)
                    {
                        LOGGER.error("Close stream exception!",e); 
                    }
	            }
	        }
	    }
	}
	
	
	/**
	 *
	* @Title: getRandomNumStr 
	* @Description: 返回2-16位随机数字字符串
	* @param len
	* @return    
	* @return String
	* @throws
	 */
	public static String getRandomNumStr(int len)
	{
	    if(len<=0 || len>16)
	    {
	        LOGGER.error("getRandomNum error,the param is illegal!");
	        return "";
	    }
	    
	    long flag=1;
	    for(int i=1;i<len;i++)
	    {
	        flag=flag*10;
	    }
	    return String.valueOf((int)((new SecureRandom().nextDouble()*9+1)*flag));
	    
	}
	
	public static void main(String[] args)
    {
        System.out.println(getRandomNumStr(5));
    }

}
