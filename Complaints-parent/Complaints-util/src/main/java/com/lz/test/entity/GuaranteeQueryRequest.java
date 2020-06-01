package com.lz.test.entity;

public class GuaranteeQueryRequest
{
    /**
     * 客户号
     */
    private String cusId;
    
    /**
     * 额度编号
     */
    private String lmtItemId;
    
    /**
     * 查询类型
     */
    private String reqType;
    
    /**
     * 证件类型
     */
    private String certType;
    
    /**
     * 证件号码
     */
    private String certCode;
    
    /**
     * 法定代表人证件类型
     */
    private String legalCertType;
    
    /**
     * 法定代表人身份证号码
     */
    private String legalCertCode;
    
    /**
     * 查询起始记录号
     */
    private Integer bgdetl;
    
    /**
     * 查询记录数
     */
    private Integer rcrdnm;

    public String getCusId()
    {
        return cusId;
    }

    public void setCusId(String cusId)
    {
        this.cusId = cusId;
    }

    public String getLmtItemId()
    {
        return lmtItemId;
    }

    public void setLmtItemId(String lmtItemId)
    {
        this.lmtItemId = lmtItemId;
    }

    public String getReqType()
    {
        return reqType;
    }

    public void setReqType(String reqType)
    {
        this.reqType = reqType;
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

    public Integer getBgdetl()
    {
        return bgdetl;
    }

    public void setBgdetl(Integer bgdetl)
    {
        this.bgdetl = bgdetl;
    }

    public Integer getRcrdnm()
    {
        return rcrdnm;
    }

    public void setRcrdnm(Integer rcrdnm)
    {
        this.rcrdnm = rcrdnm;
    }
    
    
    
}
