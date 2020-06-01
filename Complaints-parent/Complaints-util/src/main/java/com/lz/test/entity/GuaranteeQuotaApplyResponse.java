package com.lz.test.entity;

/**
 *  额度申请返回实体类
* @ClassName: GuaranteeQuotaApplyResponse 
* @Description: TODO 
* @author A18ccms a18ccms_gmail_com 
* @date 2020年2月7日 下午3:23:46 
*
 */
public class GuaranteeQuotaApplyResponse
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
     * 额度状态
     */
    private String lmtState;
    
    /**
     * 请求流水号
     */
    private String serno;
    
    /**
     * 额度编号
     */
    private String lmtItemId;

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

    public String getLmtState()
    {
        return lmtState;
    }

    public void setLmtState(String lmtState)
    {
        this.lmtState = lmtState;
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
    
    
    
}
