package poms.center.entity;

public class PromptOrder {
	
	private Integer orderID;
	private String customerName;
	private String customerPhone;
	private Integer paymentState;
	
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public Integer getPaymentState() {
		return paymentState;
	}
	public void setPaymentState(Integer paymentState) {
		this.paymentState = paymentState;
	}
	
	
	
	
}
