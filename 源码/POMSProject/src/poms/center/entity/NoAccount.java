package poms.center.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class NoAccount {
	//报社结算表,维护与报社结算信息
	private Integer recordID;//记录ID
	private Integer noID;//报社ID
	private Date beginDate;//结算开始时间
	private Date endDate;//结算结束时间
	private Double account;//结算金额
	
	//对应的get、set方法
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getRecordID() {
		return recordID;
	}
	public void setRecordID(Integer recordID) {
		this.recordID = recordID;
	}
	public Integer getNoID() {
		return noID;
	}
	public void setNoID(Integer noID) {
		this.noID = noID;
	}
	public Double getAccount() {
		return account;
	}
	public void setAccount(Double account) {
		this.account = account;
	}
	
}
