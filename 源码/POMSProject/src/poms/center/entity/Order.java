package poms.center.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	private int orderKeepTime;		//订购持续时间
	private int receiptType;	//收款类型
	private int paymentType;	//支付类型
	private int paymenteState;	//缴费情况
	private int deliverAreaID;	//投递段ID
	private int deliverID;	
	private int isDelivered;
	private int isPrinted;
	private int frequency;
	
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
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@JsonFormat(pattern="yyyy-MM-dd")
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
	public int getOrderKeepTime() {
		return orderKeepTime;
	}
	public void setOrderKeepTime(int orderKeepTime) {
		this.orderKeepTime = orderKeepTime;
	}
	public int getIsDelivered() {
		return isDelivered;
	}
	public void setIsDelivered(int isDelivered) {
		this.isDelivered = isDelivered;
	}
	public int getIsPrinted() {
		return isPrinted;
	}
	public void setIsPrinted(int isPrinted) {
		this.isPrinted = isPrinted;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	
}
