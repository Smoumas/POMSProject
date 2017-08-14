package poms.center.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Advice {
	
	private Integer adviceID;
	private Integer sendStationID;
	private Integer sendDeptID;
	private Integer receiveStationID;
	private Integer receiveDeptID;
	private Integer isReaded;
	private String content;
	private Date sendDate;

	public Integer getAdviceID() {
		return adviceID;
	}
	public void setAdviceID(Integer adviceID) {
		this.adviceID = adviceID;
	}
	public Integer getSendStationID() {
		return sendStationID;
	}
	public void setSendStationID(Integer sendStationID) {
		this.sendStationID = sendStationID;
	}
	public Integer getSendDeptID() {
		return sendDeptID;
	}
	public void setSendDeptID(Integer sendDeptID) {
		this.sendDeptID = sendDeptID;
	}
	public Integer getReceiveStationID() {
		return receiveStationID;
	}
	public void setReceiveStationID(Integer receiveStationID) {
		this.receiveStationID = receiveStationID;
	}
	public Integer getReceiveDeptID() {
		return receiveDeptID;
	}
	public void setReceiveDeptID(Integer receiveDeptID) {
		this.receiveDeptID = receiveDeptID;
	}
	public Integer getIsReaded() {
		return isReaded;
	}
	public void setIsReaded(Integer isReaded) {
		this.isReaded = isReaded;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	
	
	
	
}
