package poms.center.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Advice {
	private int adviceID;
	private int sendStationID;
	private int sendDeptID;
	private int receiveStationID;
	private int receiveDeptID;
	private int isReaded;
	private String content;
	private Date sendDate;
	public int getAdviceID() {
		return adviceID;
	}
	public void setAdviceID(int adviceID) {
		this.adviceID = adviceID;
	}
	public int getSendStationID() {
		return sendStationID;
	}
	public void setSendStationID(int sendStationID) {
		this.sendStationID = sendStationID;
	}
	public int getSendDeptID() {
		return sendDeptID;
	}
	public void setSendDeptID(int sendDeptID) {
		this.sendDeptID = sendDeptID;
	}
	public int getReceiveStationID() {
		return receiveStationID;
	}
	public void setReceiveStationID(int receiveStationID) {
		this.receiveStationID = receiveStationID;
	}
	public int getReceiveDeptID() {
		return receiveDeptID;
	}
	public void setReceiveDeptID(int receiveDeptID) {
		this.receiveDeptID = receiveDeptID;
	}
	
	public int getIsReaded() {
		return isReaded;
	}
	public void setIsReaded(int isReaded) {
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
