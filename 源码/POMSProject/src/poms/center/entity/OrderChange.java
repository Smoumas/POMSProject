package poms.center.entity;

public class OrderChange {
	//订单操作表对应属性,维护用户修改订单的信息
	private int orderID;//订单ID
	private int orderType;//操作类型
	private String oldValue;//原值
	private String newValue;//新值
	
	//对应的get、set方法
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	public String getOldValue() {
		return oldValue;
	}
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}
	public String getNewValue() {
		return newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
}
