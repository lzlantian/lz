package com.lz.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil
{
    private static final String DEFALUE_FORMAT="yyyy-MM-dd";
    
    public static String getFormatDateTime(Date date,String formatStr)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(date);
        
    }
    
    
    public static String getFormatCurrentTime(String format)
    {
        return getFormatDateTime(new Date(),format);
    }
    
    public static String getDefaultCurrentTime()
    {
        return getFormatDateTime(new Date(),DEFALUE_FORMAT);
    }
}
