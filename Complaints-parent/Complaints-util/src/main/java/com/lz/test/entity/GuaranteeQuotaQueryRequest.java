package com.lz.test.entity;

public class GuaranteeQuotaQueryRequest
{
    /**
     * 请求流水号
     */
    private String serno;
    
    /**
     * 查询类型
     */
    private String reqType;
    
    /**
     * 法定代表人证件类型
     */
    private String legalCertType;
    
    /**
     * 法定代表人身份证号码
     */
    private String legalCertCode;
    
    /**
     * 证件类型
     */
    private String certType;
    
    /**
     * 证件号码
     */
    private String certCode;
    
    /**
     * 额度类型
     */
    private String lmtType;
    
    /**
     * 手机号码
     */
    private String phone;

    public String getSerno()
    {
        return serno;
    }

    public void setSerno(String serno)
    {
        this.serno = serno;
    }

    public String getReqType()
    {
        return reqType;
    }

    public void setReqType(String reqType)
    {
        this.reqType = reqType;
    }

    public String getLegalCertType()
    {
        return legalCertType;
    }

    public void setLegalCertType(String legalCertType)
    {
        this.legalCertType = legalCertType;
    }

    public String getLegalCertCode()
    {
        return legalCertCode;
    }

    public void setLegalCertCode(String legalCertCode)
    {
        this.legalCertCode = legalCertCode;
    }

    public String getCertType()
    {
        return certType;
    }

    public void setCertType(String certType)
    {
        this.certType = certType;
    }

    public String getCertCode()
    {
        return certCode;
    }

    public void setCertCode(String certCode)
    {
        this.certCode = certCode;
    }

    public String getLmtType()
    {
        return lmtType;
    }

    public void setLmtType(String lmtType)
    {
        this.lmtType = lmtType;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    
    
}
