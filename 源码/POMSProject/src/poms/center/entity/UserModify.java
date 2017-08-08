package poms.center.entity;

public class UserModify {
	//用户变更表对应属性,用来记录用户变更记录及其原因
	private int recordID;//记录ID
	private int orderID;//订单ID
	private int type;//变更类型
	private String reason;//原因
	
	//对应的get、set方法
	public int getRecordID() {
		return recordID;
	}
	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
