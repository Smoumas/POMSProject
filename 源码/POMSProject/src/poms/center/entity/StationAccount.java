package poms.center.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StationAccount {
	//分站结算表对应属性,维护分站的业绩信息
	private Integer recordID;//记录ID
	private Integer stationID;//分站ID
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
	public Integer getStationID() {
		return stationID;
	}
	public void setStationID(Integer stationID) {
		this.stationID = stationID;
	}
	public Double getAccount() {
		return account;
	}
	public void setAccount(Double account) {
		this.account = account;
	}
	
	
}
