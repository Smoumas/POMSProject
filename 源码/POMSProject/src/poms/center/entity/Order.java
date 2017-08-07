package poms.center.entity;

import java.util.Date;

public class Order {
	private int orderID;
	private int newspaperID;
	private int customerID;
	private int stationID;
	private int orderType;
	private String orderAddress;
	private int orderNum;
	private int salerID;
	private Date orderDate;
	private Date deliverDate;
	private int orderDays;		//订购天数
	private int receiptType;	//收款类型
	private int paymentType;	//支付类型
	private int paymenteState;	//缴费情况
	private int deliverAreaID;	//投递段ID
	private int deliverID;	
	private boolean isDelivered;
	private boolean isPrinted;
	
	public int getOrderDays() {
		return orderDays;
	}
	public void setOrderDays(int orderDays) {
		this.orderDays = orderDays;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getNewspaperID() {
		return newspaperID;
	}
	public void setNewspaperID(int newspaperID) {
		this.newspaperID = newspaperID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getStationID() {
		return stationID;
	}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public int getSalerID() {
		return salerID;
	}
	public void setSalerID(int salerID) {
		this.salerID = salerID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliverDate() {
		return deliverDate;
	}
	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}
	public int getReceiptType() {
		return receiptType;
	}
	public void setReceiptType(int receiptType) {
		this.receiptType = receiptType;
	}
	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	public int getPaymenteState() {
		return paymenteState;
	}
	public void setPaymenteState(int paymenteState) {
		this.paymenteState = paymenteState;
	}
	public int getDeliverAreaID() {
		return deliverAreaID;
	}
	public void setDeliverAreaID(int deliverAreaID) {
		this.deliverAreaID = deliverAreaID;
	}
	public int getDeliverID() {
		return deliverID;
	}
	public void setDeliverID(int deliverID) {
		this.deliverID = deliverID;
	}
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	public boolean isPrinted() {
		return isPrinted;
	}
	public void setPrinted(boolean isPrinted) {
		this.isPrinted = isPrinted;
	}
	
	
}
