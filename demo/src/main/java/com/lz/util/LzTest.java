package com.lz.util;

import java.security.SecureRandom;

public class LzTest
{
    public static void main(String[] args)
    {
       for(int i=0;i<100;i++)
       {
           System.out.println(new SecureRandom().nextDouble());
       }
       
    }

}
class AA{
    private Integer id;
    private String code;
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getCode()
    {
        return code;
    }
    public void setCode(String code)
    {
        this.code = code;
    }
    
    
}
