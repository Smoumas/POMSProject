package poms.center.entity;

public class PromptOrder {
	
	private int orderID;
	private String customerName;
	private String customerPhone;
	private int paymentState;
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
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
	public int getPaymentState() {
		return paymentState;
	}
	public void setPaymentState(int paymentState) {
		this.paymentState = paymentState;
	}
	
	
}
