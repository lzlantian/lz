package com.lz.util;

import java.math.BigDecimal;

public class NumberUtils
{
 
    /**
     * 四舍五入截取小数N位
    * @Title: keepPrecision 
    * @Description: TODO
    * @param number
    * @param precision
    * @return    
    * @return double
    * @throws
     */
    public static double keepPrecision(double number, int precision) {
        BigDecimal bg = new BigDecimal(number);
        return bg.setScale(precision, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    /**
     * 四舍五入截取小数N位
    * @Title: keepPrecision 
    * @Description: TODO
    * @param number
    * @param precision
    * @return    
    * @return double
    * @throws
     */
    
    public static float keepPrecision(float number, int precision) {
        BigDecimal bg = new BigDecimal(number);
        return bg.setScale(precision, BigDecimal.ROUND_HALF_UP).floatValue();
    }
    
   /**
    * 截取N位小数
   * @Title: subNum 
   * @Description: TODO
   * @param number
   * @param precision
   * @return    
   * @return String
   * @throws
    */
    public static String subNum(float number,int precision)
    {
        return String.valueOf(number).substring(beginIndex)
    }

    
    public static void main(String[] args)
    {
        System.out.println(keepPrecision(123.456,2));
        
    }

}
