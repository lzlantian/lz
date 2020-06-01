package com.lz.test.entity;

/**
 * 额度申请请求实体类
* @ClassName: GuaranteeQuotaApplyRequest 
* @Description: TODO 
* @author A18ccms a18ccms_gmail_com 
* @date 2020年2月7日 下午3:23:11 
*
 */
public class GuaranteeQuotaApplyRequest
{
    /**
     * 请求流水号
     */
    private String serno;
    
    /**
     * 产品类型
     */
    private String proType;
    
    /**
     * 企业名称
     */
    private String cusName;
    
    /**
     * 统一社会信用代码
     */
    private String entCreditID;
    
    /**
     * 企业地址
     */
    private String addreass;
    
    /**
     * 法人姓名
     */
    private String legalCusName;
    
    /**
     * 法人身份证号码
     */
    private String legalCertCode;
    
    /**
     * 法人手机号
     */
    private String legalPhone;
    
    /**
     * 法人银行卡卡号
     */
    private String legalCardNo;
    
    /**
     * 注册资本
     */
    private String registCapital;
    
    /**
     * 上年度销售收入
     */
    private String lastYearIncome;
    
    /**
     * 经营范围
     */
    private String businessScope;
    
    /**
     * 客户经理
     */
    private String cusManager;
    
    /**
     * 经办网点
     */
    private String nearbyOutlets;

    public String getSerno()
    {
        return serno;
    }

    public void setSerno(String serno)
    {
        this.serno = serno;
    }

    public String getProType()
    {
        return proType;
    }

    public void setProType(String proType)
    {
        this.proType = proType;
    }

    public String getCusName()
    {
        return cusName;
    }

    public void setCusName(String cusName)
    {
        this.cusName = cusName;
    }

    public String getEntCreditID()
    {
        return entCreditID;
    }

    public void setEntCreditID(String entCreditID)
    {
        this.entCreditID = entCreditID;
    }

    public String getAddreass()
    {
        return addreass;
    }

    public void setAddreass(String addreass)
    {
        this.addreass = addreass;
    }

    public String getLegalCusName()
    {
        return legalCusName;
    }

    public void setLegalCusName(String legalCusName)
    {
        this.legalCusName = legalCusName;
    }

    public String getLegalCertCode()
    {
        return legalCertCode;
    }

    public void setLegalCertCode(String legalCertCode)
    {
        this.legalCertCode = legalCertCode;
    }

    public String getLegalPhone()
    {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone)
    {
        this.legalPhone = legalPhone;
    }

    public String getLegalCardNo()
    {
        return legalCardNo;
    }

    public void setLegalCardNo(String legalCardNo)
    {
        this.legalCardNo = legalCardNo;
    }

    public String getRegistCapital()
    {
        return registCapital;
    }

    public void setRegistCapital(String registCapital)
    {
        this.registCapital = registCapital;
    }

    public String getLastYearIncome()
    {
        return lastYearIncome;
    }

    public void setLastYearIncome(String lastYearIncome)
    {
        this.lastYearIncome = lastYearIncome;
    }

    public String getBusinessScope()
    {
        return businessScope;
    }

    public void setBusinessScope(String businessScope)
    {
        this.businessScope = businessScope;
    }

    public String getCusManager()
    {
        return cusManager;
    }

    public void setCusManager(String cusManager)
    {
        this.cusManager = cusManager;
    }

    public String getNearbyOutlets()
    {
        return nearbyOutlets;
    }

    public void setNearbyOutlets(String nearbyOutlets)
    {
        this.nearbyOutlets = nearbyOutlets;
    }
    
    
    
}
