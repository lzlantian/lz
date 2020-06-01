package com.lz.test.entity;


/**
 * ELE_GUARANTEE_QUOTA_APPLY 实体类
 * Thu Feb 06 19:01:05 GMT+08:00 2020 李沼
 */ 

public class ELEGUARANTEEQUOTAAPPLY {

   /**
     * ID
     */ 
	private int ID;

   /**
     * 企业名称
     */ 
	private String ENTERPRISENAME;

   /**
     * 社会统一信用代码
     */ 
	private String CREDITCODE;

   /**
     * 企业所在地
     */ 
	private String ENTERPRISEADDR;

   /**
     * 详细地址
     */ 
	private String DETAILADDR;

   /**
     * 注册资本，以万元为单位
     */ 
	private float REGISTEREDCAPITAL;

   /**
     * 经营范围
     */ 
	private String BUSINESSSCOPE;

   /**
     * 法人姓名
     */ 
	private String LEGALNAME;

   /**
     * 法人手机号
     */ 
	private String LEGALMOBILE;

   /**
     * 法人银行卡号
     */ 
	private String LEGALBANKNO;

   /**
     * 协议证书流水号
     */ 
	private String CONTRACTSERINO;

   /**
     * 推荐人
     */ 
	private String REFERENCES;

   /**
     * 经办网点
     */ 
	private String AGENTNETWORK;

   /**
     * 身份证号码
     */ 
	private String IDCARD;

   /**
     * 创建时间
     */ 
	private null CREATETIME;

   /**
     * 更新时间
     */ 
	private null UPDATETIME;

   /**
     * 状态
     */ 
	private int STATUS;
	public int getID(){
		return ID;
	}

	public void setID(int ID){
		this.ID = ID;
	}

	public String getENTERPRISENAME(){
		return ENTERPRISENAME;
	}

	public void setENTERPRISENAME(String ENTERPRISENAME){
		this.ENTERPRISENAME = ENTERPRISENAME;
	}

	public String getCREDITCODE(){
		return CREDITCODE;
	}

	public void setCREDITCODE(String CREDITCODE){
		this.CREDITCODE = CREDITCODE;
	}

	public String getENTERPRISEADDR(){
		return ENTERPRISEADDR;
	}

	public void setENTERPRISEADDR(String ENTERPRISEADDR){
		this.ENTERPRISEADDR = ENTERPRISEADDR;
	}

	public String getDETAILADDR(){
		return DETAILADDR;
	}

	public void setDETAILADDR(String DETAILADDR){
		this.DETAILADDR = DETAILADDR;
	}

	public float getREGISTEREDCAPITAL(){
		return REGISTEREDCAPITAL;
	}

	public void setREGISTEREDCAPITAL(float REGISTEREDCAPITAL){
		this.REGISTEREDCAPITAL = REGISTEREDCAPITAL;
	}

	public String getBUSINESSSCOPE(){
		return BUSINESSSCOPE;
	}

	public void setBUSINESSSCOPE(String BUSINESSSCOPE){
		this.BUSINESSSCOPE = BUSINESSSCOPE;
	}

	public String getLEGALNAME(){
		return LEGALNAME;
	}

	public void setLEGALNAME(String LEGALNAME){
		this.LEGALNAME = LEGALNAME;
	}

	public String getLEGALMOBILE(){
		return LEGALMOBILE;
	}

	public void setLEGALMOBILE(String LEGALMOBILE){
		this.LEGALMOBILE = LEGALMOBILE;
	}

	public String getLEGALBANKNO(){
		return LEGALBANKNO;
	}

	public void setLEGALBANKNO(String LEGALBANKNO){
		this.LEGALBANKNO = LEGALBANKNO;
	}

	public String getCONTRACTSERINO(){
		return CONTRACTSERINO;
	}

	public void setCONTRACTSERINO(String CONTRACTSERINO){
		this.CONTRACTSERINO = CONTRACTSERINO;
	}

	public String getREFERENCES(){
		return REFERENCES;
	}

	public void setREFERENCES(String REFERENCES){
		this.REFERENCES = REFERENCES;
	}

	public String getAGENTNETWORK(){
		return AGENTNETWORK;
	}

	public void setAGENTNETWORK(String AGENTNETWORK){
		this.AGENTNETWORK = AGENTNETWORK;
	}

	public String getIDCARD(){
		return IDCARD;
	}

	public void setIDCARD(String IDCARD){
		this.IDCARD = IDCARD;
	}

	public null getCREATETIME(){
		return CREATETIME;
	}

	public void setCREATETIME(null CREATETIME){
		this.CREATETIME = CREATETIME;
	}

	public null getUPDATETIME(){
		return UPDATETIME;
	}

	public void setUPDATETIME(null UPDATETIME){
		this.UPDATETIME = UPDATETIME;
	}

	public int getSTATUS(){
		return STATUS;
	}

	public void setSTATUS(int STATUS){
		this.STATUS = STATUS;
	}

}

