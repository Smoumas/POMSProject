package poms.center.entity;

public class Invoice {
	//发票表对应属性,维护发票基本信息
	private Integer invoiceID;//发票ID
	private Integer orderID;//订单ID
	private Integer stationID;//所属分站ID
	private String stationName;
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	private Integer state;//发票状态
	public Integer getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(Integer invoiceID) {
		this.invoiceID = invoiceID;
	}
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public Integer getStationID() {
		return stationID;
	}
	public void setStationID(Integer stationID) {
		this.stationID = stationID;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	//对应的get、set方法
	
	
	
}
