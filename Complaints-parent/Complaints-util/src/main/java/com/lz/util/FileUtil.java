package com.lz.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public class FileUtil
{
    
    private static final Logger LOGGER = Logger.getLogger(FileUtil.class);
    
    /**
     * ��ȡ�ļ�
     * 
     * @param filePath
     * @return
     */
    public static String readFile(String filePath)
    {
        StringBuffer result = new StringBuffer();
        if (StringUtils.isEmpty(filePath))
        {
            LOGGER.warn("readFile failed! the filePath is empty!");
            return result.toString();
        }
        File file = new File(filePath);
        if (!file.exists())
        {
            LOGGER.warn(String.format("the file:%s is not exists!", filePath));
            
            return result.toString();
        }
        
        FileInputStream fis = null;
        try
        {
            
            fis = new FileInputStream(file);
            byte[] buf = new byte[1024];
            int len = 0;
            
            while ((len = fis.read(buf)) != -1)
            {
                result.append(new String(buf, 0, len));
            }
            
        }
        catch (Exception e)
        {
            LOGGER.error("readFile exception!", e);
        }
        finally
        {
            CommonUtil.closeStream(fis);
        }
        
        return result.toString();
    }
    
    /**
     * 
    * @Title: writeFile 
    * @Description: TODO
    * @param filePath
    * @param over
    * @param text    
    * @return void
    * @throws
     */
    public static void writeFile(String filePath, boolean over, String text)
    {
        if (StringUtils.isEmpty(filePath) || StringUtils.isEmpty(text))
        {
            LOGGER.warn("writeFile failed! param is illegal!");
            return;
        }
        
        File file = new File(filePath);
        
        File parentDir = file.getParentFile();
        if (!parentDir.exists())
        {
            parentDir.mkdirs();
        }
        
        FileOutputStream fos = null;
        try
        {
            if (!file.exists())
            {
                file.createNewFile();
            }
            fos = new FileOutputStream(file,over);
            fos.write(text.getBytes());
        }
        catch (IOException e)
        {
            LOGGER.error("writeFile exception!", e);
        }
        finally
        {
            CommonUtil.closeStream(fos);
        }
        
    }
}
