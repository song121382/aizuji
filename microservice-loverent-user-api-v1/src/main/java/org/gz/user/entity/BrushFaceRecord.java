package org.gz.user.entity;

import java.util.Date;

/**
 * ocr记录
 * 
 * @author yangdx
 *
 */
public class BrushFaceRecord {
	/**ID*/
    private Long recordId;
    /**user ID*/
    private Long userId;
    /**手机号*/
    private String mobile;
    /**cor orderno*/
    private String orderNo;
    /**操作时间*/
    private Date brushTime;
    /**0-失败 1-成功*/
    private Integer brushStatus;
    /**0-未拉取 1-已拉取*/
    private Integer fetchState;

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getBrushTime() {
		return brushTime;
	}

	public void setBrushTime(Date brushTime) {
		this.brushTime = brushTime;
	}

	public Integer getBrushStatus() {
		return brushStatus;
	}

	public void setBrushStatus(Integer brushStatus) {
		this.brushStatus = brushStatus;
	}

	public Integer getFetchState() {
		return fetchState;
	}

	public void setFetchState(Integer fetchState) {
		this.fetchState = fetchState;
	}

    
}