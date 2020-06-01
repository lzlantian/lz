package com.lz.test.entity;

import java.util.Date;

/**
 * ELE_GUARANTEE_QUOTA_APPLY 额度申请实体类
 * Fri Feb 07 14:56:21 GMT+08:00 2020 李沼
 */ 

public class EleGuaranteeQuotaApplyVo {

   /**
     * ID
     */ 
	private int id;

   /**
     * 企业名称
     */ 
	private String cusName;

   /**
     * 社会统一信用代码
     */ 
	private String entCreditId;

   /**
     * 企业所在地
     */ 
	private String enterpriseAddr;

   /**
     * 详细地址
     */ 
	private String addreass;

   /**
     * 法人姓名
     */ 
	private String legalCusName;

   /**
     * 法人手机号
     */ 
	private String legalPhone;

   /**
     * 法人银行卡号
     */ 
	private String legalCardNo;

   /**
     * 法人身份证号码
     */ 
	private String legalCertCode;

   /**
     * 注册资本，以万元为单位
     */ 
	private float registCapital;

   /**
     * 上年度销售收入
     */ 
	private float lastYearIncome;

   /**
     * 经营范围
     */ 
	private String businessScope;

   /**
     * 协议证书流水号
     */ 
	private String contractSerno;

   /**
     * 推荐人
     */ 
	private String references;

   /**
     * 经办网点
     */ 
	private String nearbyOutlets;

   /**
     * 创建时间
     */ 
	private Date createTime;

   /**
     * 更新时间
     */ 
	private Date updateTime;

   /**
     * 状态
     */ 
	private int status;

   /**
     * 额度编号
     */ 
	private String lmtItemId;

   /**
     * 请求流水号
     */ 
	private String requestSerno;
	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getCusName(){
		return cusName;
	}

	public void setCusName(String cusName){
		this.cusName = cusName;
	}

	public String getEntCreditId(){
		return entCreditId;
	}

	public void setEntCreditId(String entCreditId){
		this.entCreditId = entCreditId;
	}

	public String getEnterpriseAddr(){
		return enterpriseAddr;
	}

	public void setEnterpriseAddr(String enterpriseAddr){
		this.enterpriseAddr = enterpriseAddr;
	}

	public String getAddreass(){
		return addreass;
	}

	public void setAddreass(String addreass){
		this.addreass = addreass;
	}

	public String getLegalCusName(){
		return legalCusName;
	}

	public void setLegalCusName(String legalCusName){
		this.legalCusName = legalCusName;
	}

	public String getLegalPhone(){
		return legalPhone;
	}

	public void setLegalPhone(String legalPhone){
		this.legalPhone = legalPhone;
	}

	public String getLegalCardNo(){
		return legalCardNo;
	}

	public void setLegalCardNo(String legalCardNo){
		this.legalCardNo = legalCardNo;
	}

	public String getLegalCertCode(){
		return legalCertCode;
	}

	public void setLegalCertCode(String legalCertCode){
		this.legalCertCode = legalCertCode;
	}

	public float getRegistCapital(){
		return registCapital;
	}

	public void setRegistCapital(float registCapital){
		this.registCapital = registCapital;
	}

	public float getLastYearIncome(){
		return lastYearIncome;
	}

	public void setLastYearIncome(float lastYearIncome){
		this.lastYearIncome = lastYearIncome;
	}

	public String getBusinessScope(){
		return businessScope;
	}

	public void setBusinessScope(String businessScope){
		this.businessScope = businessScope;
	}

	public String getContractSerno(){
		return contractSerno;
	}

	public void setContractSerno(String contractSerno){
		this.contractSerno = contractSerno;
	}

	public String getReferences(){
		return references;
	}

	public void setReferences(String references){
		this.references = references;
	}

	public String getNearbyOutlets(){
		return nearbyOutlets;
	}

	public void setNearbyOutlets(String nearbyOutlets){
		this.nearbyOutlets = nearbyOutlets;
	}

	public Date getCreateTime(){
		return createTime;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getUpdateTime(){
		return updateTime;
	}

	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	public int getStatus(){
		return status;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public String getLmtItemId(){
		return lmtItemId;
	}

	public void setLmtItemId(String lmtItemId){
		this.lmtItemId = lmtItemId;
	}

	public String getRequestSerno(){
		return requestSerno;
	}

	public void setRequestSerno(String requestSerno){
		this.requestSerno = requestSerno;
	}

}

