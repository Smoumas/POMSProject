package poms.center.entity;

public class OrderChange {
	//订单操作表对应属性,维护用户修改订单的信息
	private Integer orderID;//订单ID
	private Integer changeType;//操作类型
	private String oldValue;//原值
	private String newValue;//新值
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	
	public Integer getChangeType() {
		return changeType;
	}
	public void setChangeType(Integer changeType) {
		this.changeType = changeType;
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
	
	//对应的get、set方法
	
	
}
