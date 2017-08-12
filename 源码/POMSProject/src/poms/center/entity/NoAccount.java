package poms.center.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class NoAccount {
	//报社结算表,维护与报社结算信息
	private int recordID;//记录ID
	private int noID;//报社ID
	private Date beginDate;//结算开始时间
	private Date endDate;//结算结束时间
	private double account;//结算金额
	
	//对应的get、set方法
	public int getRecordID() {
		return recordID;
	}
	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}
	public int getNoID() {
		return noID;
	}
	public void setNoID(int noID) {
		this.noID = noID;
	}
	
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
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}
}
