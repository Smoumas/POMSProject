package poms.center.entity;

public class UserModify {
	//用户变更表对应属性,用来记录用户变更记录及其原因
	private Integer recordID;//记录ID
	private Integer orderID;//订单ID
	private Integer type;//变更类型
	private String reason;//原因
	public Integer getRecordID() {
		return recordID;
	}
	public void setRecordID(Integer recordID) {
		this.recordID = recordID;
	}
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	//对应的get、set方法
	
}
