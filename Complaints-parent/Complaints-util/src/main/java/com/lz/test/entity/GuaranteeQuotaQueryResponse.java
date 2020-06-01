package com.lz.test.entity;

import java.util.Date;

public class GuaranteeQuotaQueryResponse
{
    /**
     * 业务响应码
     */
    private String repcode;
    
    /**
     * 业务响应信息
     */
    private String repmsg;
    
    /**
     * 请求流水号
     */
    private String serno;
    
    /**
     * 额度编号
     */
    private String lmtItemId;
    
    /**
     * 客户号
     */
    private String cusId;
    
    /**
     * 授信额度(元)
     */
    private String crdLmt;
    
    /**
     * 已用额度(元)
     */
    private String outstndLmt;
    
    /**
     * 额度到期日
     */
    private String endDate;
    
    /**
     * 额度状态
     */
    private String lmtState;
    
    /**
     * 法定代表人/负责人姓名
     */
    private String legalName;
    
    /**
     * 法定代表人证件号码
     */
    private String legalCertCode;
    
    /**
     * 统一社会信用代码
     */
    private String entCreditID;
    
    /**
     * 额度起始日
     */
    private Date startDate;
    
    /**
     * 邮箱
     */
    private String email;
    
    /**
     * 申请日期
     */
    private Date appDate;
    
    /**
     * 申请期限（月）
     */
    private int appTerm;
    
    /**
     * 客户经理工号
     */
    private String cusManager;
    
    /**
     * 客户经理名称
     */
    private String cusManagerName;
    
    /**
     * 附近网点
     */
    private String nearbyOutlets;
    
    /**
     * 手机号码
     */
    private String phone;
    
    /**
     * 企业名称
     */
    private String cusName;
    
    /**
     * 失败原因
     */
    private String reason;
    
    /**
     * 费率
     */
    private float rate;

    public String getRepcode()
    {
        return repcode;
    }

    public void setRepcode(String repcode)
    {
        this.repcode = repcode;
    }

    public String getRepmsg()
    {
        return repmsg;
    }

    public void setRepmsg(String repmsg)
    {
        this.repmsg = repmsg;
    }

    public String getSerno()
    {
        return serno;
    }

    public void setSerno(String serno)
    {
        this.serno = serno;
    }

    public String getLmtItemId()
    {
        return lmtItemId;
    }

    public void setLmtItemId(String lmtItemId)
    {
        this.lmtItemId = lmtItemId;
    }

    public String getCusId()
    {
        return cusId;
    }

    public void setCusId(String cusId)
    {
        this.cusId = cusId;
    }

    public String getCrdLmt()
    {
        return crdLmt;
    }

    public void setCrdLmt(String crdLmt)
    {
        this.crdLmt = crdLmt;
    }

    public String getOutstndLmt()
    {
        return outstndLmt;
    }

    public void setOutstndLmt(String outstndLmt)
    {
        this.outstndLmt = outstndLmt;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public String getLmtState()
    {
        return lmtState;
    }

    public void setLmtState(String lmtState)
    {
        this.lmtState = lmtState;
    }

    public String getLegalName()
    {
        return legalName;
    }

    public void setLegalName(String legalName)
    {
        this.legalName = legalName;
    }

    public String getLegalCertCode()
    {
        return legalCertCode;
    }

    public void setLegalCertCode(String legalCertCode)
    {
        this.legalCertCode = legalCertCode;
    }

    public String getEntCreditID()
    {
        return entCreditID;
    }

    public void setEntCreditID(String entCreditID)
    {
        this.entCreditID = entCreditID;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Date getAppDate()
    {
        return appDate;
    }

    public void setAppDate(Date appDate)
    {
        this.appDate = appDate;
    }

    public int getAppTerm()
    {
        return appTerm;
    }

    public void setAppTerm(int appTerm)
    {
        this.appTerm = appTerm;
    }

    public String getCusManager()
    {
        return cusManager;
    }

    public void setCusManager(String cusManager)
    {
        this.cusManager = cusManager;
    }

    public String getCusManagerName()
    {
        return cusManagerName;
    }

    public void setCusManagerName(String cusManagerName)
    {
        this.cusManagerName = cusManagerName;
    }

    public String getNearbyOutlets()
    {
        return nearbyOutlets;
    }

    public void setNearbyOutlets(String nearbyOutlets)
    {
        this.nearbyOutlets = nearbyOutlets;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCusName()
    {
        return cusName;
    }

    public void setCusName(String cusName)
    {
        this.cusName = cusName;
    }

    public String getReason()
    {
        return reason;
    }

    public void setReason(String reason)
    {
        this.reason = reason;
    }

    public float getRate()
    {
        return rate;
    }

    public void setRate(float rate)
    {
        this.rate = rate;
    }
    
    
    
}
