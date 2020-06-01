package test.domain;

import java.util.Date;

public class User {
    private Integer id;

    private String cusName;

    private String entCreditId;

    private String enterpriseAddr;

    private String addreass;

    private String legalCusName;

    private String legalPhone;

    private String legalCardNo;

    private String legalCertCode;

    private Float registCapital;

    private Float lastYearIncome;

    private String businessScope;

    private String contractSerno;

    private String references;

    private String nearbyOutlets;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    private String lmtItemId;

    private String requestSerno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getEntCreditId() {
        return entCreditId;
    }

    public void setEntCreditId(String entCreditId) {
        this.entCreditId = entCreditId == null ? null : entCreditId.trim();
    }

    public String getEnterpriseAddr() {
        return enterpriseAddr;
    }

    public void setEnterpriseAddr(String enterpriseAddr) {
        this.enterpriseAddr = enterpriseAddr == null ? null : enterpriseAddr.trim();
    }

    public String getAddreass() {
        return addreass;
    }

    public void setAddreass(String addreass) {
        this.addreass = addreass == null ? null : addreass.trim();
    }

    public String getLegalCusName() {
        return legalCusName;
    }

    public void setLegalCusName(String legalCusName) {
        this.legalCusName = legalCusName == null ? null : legalCusName.trim();
    }

    public String getLegalPhone() {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone == null ? null : legalPhone.trim();
    }

    public String getLegalCardNo() {
        return legalCardNo;
    }

    public void setLegalCardNo(String legalCardNo) {
        this.legalCardNo = legalCardNo == null ? null : legalCardNo.trim();
    }

    public String getLegalCertCode() {
        return legalCertCode;
    }

    public void setLegalCertCode(String legalCertCode) {
        this.legalCertCode = legalCertCode == null ? null : legalCertCode.trim();
    }

    public Float getRegistCapital() {
        return registCapital;
    }

    public void setRegistCapital(Float registCapital) {
        this.registCapital = registCapital;
    }

    public Float getLastYearIncome() {
        return lastYearIncome;
    }

    public void setLastYearIncome(Float lastYearIncome) {
        this.lastYearIncome = lastYearIncome;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    public String getContractSerno() {
        return contractSerno;
    }

    public void setContractSerno(String contractSerno) {
        this.contractSerno = contractSerno == null ? null : contractSerno.trim();
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references == null ? null : references.trim();
    }

    public String getNearbyOutlets() {
        return nearbyOutlets;
    }

    public void setNearbyOutlets(String nearbyOutlets) {
        this.nearbyOutlets = nearbyOutlets == null ? null : nearbyOutlets.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLmtItemId() {
        return lmtItemId;
    }

    public void setLmtItemId(String lmtItemId) {
        this.lmtItemId = lmtItemId == null ? null : lmtItemId.trim();
    }

    public String getRequestSerno() {
        return requestSerno;
    }

    public void setRequestSerno(String requestSerno) {
        this.requestSerno = requestSerno == null ? null : requestSerno.trim();
    }
}