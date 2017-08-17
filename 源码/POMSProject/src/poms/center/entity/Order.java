package poms.center.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Order {
	private Integer orderID;
	private Integer newspaperID;
	private Integer customerID;
	private String customerName;
	private Integer stationID;
	private Integer orderType;
	private String orderAddress;
	private Integer orderNum;
	private Integer salerID;
	private Date orderDate;
	private Date deliverDate;
	private Integer orderKeepTime;		//订购持续时间
	private Integer receiptType;	//收款类型
	private Integer paymentType;	//支付类型
	private Integer paymentState;	//缴费情况
	private Integer deliverAreaID;	//投递段ID
	private Integer deliverID;	
	private Integer isDelivered;
	private Integer isPrinted;
	private Integer frequency;
	
	
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public Integer getNewspaperID() {
		return newspaperID;
	}
	public void setNewspaperID(Integer newspaperID) {
		this.newspaperID = newspaperID;
	}
	public Integer getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}
	public Integer getStationID() {
		return stationID;
	}
	public void setStationID(Integer stationID) {
		this.stationID = stationID;
	}
	public Integer getOrderType() {
		return orderType;
	}
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public Integer getSalerID() {
		return salerID;
	}
	public void setSalerID(Integer salerID) {
		this.salerID = salerID;
	}
	public Integer getOrderKeepTime() {
		return orderKeepTime;
	}
	public void setOrderKeepTime(Integer orderKeepTime) {
		this.orderKeepTime = orderKeepTime;
	}
	public Integer getReceiptType() {
		return receiptType;
	}
	public void setReceiptType(Integer receiptType) {
		this.receiptType = receiptType;
	}
	public Integer getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}
	public Integer getPaymentState() {
		return paymentState;
	}
	public void setPaymentState(Integer paymentState) {
		this.paymentState = paymentState;
	}
	public Integer getDeliverAreaID() {
		return deliverAreaID;
	}
	public void setDeliverAreaID(Integer deliverAreaID) {
		this.deliverAreaID = deliverAreaID;
	}
	public Integer getDeliverID() {
		return deliverID;
	}
	public void setDeliverID(Integer deliverID) {
		this.deliverID = deliverID;
	}
	public Integer getIsDelivered() {
		return isDelivered;
	}
	public void setIsDelivered(Integer isDelivered) {
		this.isDelivered = isDelivered;
	}
	public Integer getIsPrinted() {
		return isPrinted;
	}
	public void setIsPrinted(Integer isPrinted) {
		this.isPrinted = isPrinted;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	
	
}
