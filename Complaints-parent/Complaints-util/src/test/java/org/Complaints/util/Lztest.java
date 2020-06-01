package org.Complaints.util;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

public class Lztest
{
    
    public static void main(String[] args)
    {
        String fieldStr="serno\r\n" + 
            "cusName\r\n" + 
            "amountGua\r\n" + 
            "applyTerm\r\n" + 
            "baohanNo\r\n" + 
            "biaoduanName\r\n" + 
            "biaoduanNo\r\n" + 
            "applyDate\r\n" + 
            "cost\r\n" + 
            "state\r\n" + 
            "accract\r\n" + 
            "rate\r\n" + 
            "entCreditID\r\n" + 
            "tenderer\r\n" + 
            "kaibiaoTime\r\n" + 
            "contractNo\r\n" + 
            "";
        
        
        String descStr="业务流水号\r\n" + 
            "企业名称\r\n" + 
            "保函金额\r\n" + 
            "保函期限\r\n" + 
            "保函编号\r\n" + 
            "标段名称\r\n" + 
            "标段编号\r\n" + 
            "申请日期\r\n" + 
            "保函手续费\r\n" + 
            "保函状态\r\n" + 
            "支付账户\r\n" + 
            "保函费率\r\n" + 
            "统一社会信用代码\r\n" + 
            "招标人\r\n" + 
            "开标时间\r\n" + 
            "合同编号\r\n" + 
            "";
        
        String[] fields = fieldStr.split("\\r\\n");
        String[] descs = descStr.split("\\r\\n");
        
        if(fields.length!=descs.length)
        {
            System.out.println("错误1");
            return;
        }
        for(int i=0;i<fields.length;i++)
        {
            System.out.println("\""
                + fields[i]+"\":"+"\""
                    + descs[i]+"\",");

//            System.out.println("\t/**");
//            System.out.println("\t\t"+descs[i]);
//            System.out.println(" \t*/");
//            System.out.println("\tprivate String "+fields[i]+";");
        }
    }
}
