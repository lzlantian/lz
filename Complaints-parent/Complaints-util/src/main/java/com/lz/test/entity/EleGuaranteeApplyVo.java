package com.lz.test.entity;

import java.util.Date;

/**
 * ELE_GUARANTEE_APPLY 保函开立实例类
 * Fri Feb 07 14:55:58 GMT+08:00 2020 李沼
 */ 

public class EleGuaranteeApplyVo {

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
     * 保函金额
     */ 
	private float guaranteeAmount;

   /**
     * 保函期限开始时间
     */ 
	private Date guaranteeStartTime;

   /**
     * 保函期限结束时间
     */ 
	private Date guaranteeEndTime;

   /**
     * 保函编号
     */ 
	private String guaranteeCode;

   /**
     * 保函费率
     */ 
	private float guaranteeRate;

   /**
     * 申请时间
     */ 
	private Date applyTime;

   /**
     * 手续费
     */ 
	private float cost;

   /**
     * 支付账号
     */ 
	private String payerAccount;

   /**
     * 支付户名
     */ 
	private String payerName;

   /**
     * 协议证书流水号
     */ 
	private String contractSerino;

   /**
     * 可用余额
     */ 
	private float availableBalance;

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

	public float getGuaranteeAmount(){
		return guaranteeAmount;
	}

	public void setGuaranteeAmount(float guaranteeAmount){
		this.guaranteeAmount = guaranteeAmount;
	}

	public Date getGuaranteeStartTime(){
		return guaranteeStartTime;
	}

	public void setGuaranteeStartTime(Date guaranteeStartTime){
		this.guaranteeStartTime = guaranteeStartTime;
	}

	public Date getGuaranteeEndTime(){
		return guaranteeEndTime;
	}

	public void setGuaranteeEndTime(Date guaranteeEndTime){
		this.guaranteeEndTime = guaranteeEndTime;
	}

	public String getGuaranteeCode(){
		return guaranteeCode;
	}

	public void setGuaranteeCode(String guaranteeCode){
		this.guaranteeCode = guaranteeCode;
	}

	public float getGuaranteeRate(){
		return guaranteeRate;
	}

	public void setGuaranteeRate(float guaranteeRate){
		this.guaranteeRate = guaranteeRate;
	}

	public Date getApplyTime(){
		return applyTime;
	}

	public void setApplyTime(Date applyTime){
		this.applyTime = applyTime;
	}

	public float getCost(){
		return cost;
	}

	public void setCost(float cost){
		this.cost = cost;
	}

	public String getPayerAccount(){
		return payerAccount;
	}

	public void setPayerAccount(String payerAccount){
		this.payerAccount = payerAccount;
	}

	public String getPayerName(){
		return payerName;
	}

	public void setPayerName(String payerName){
		this.payerName = payerName;
	}

	public String getContractSerino(){
		return contractSerino;
	}

	public void setContractSerino(String contractSerino){
		this.contractSerino = contractSerino;
	}

	public float getAvailableBalance(){
		return availableBalance;
	}

	public void setAvailableBalance(float availableBalance){
		this.availableBalance = availableBalance;
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

}

