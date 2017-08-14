package poms.center.entity;

public class Invoice {
	//发票表对应属性,维护发票基本信息
	private int invoiceID;//发票ID
	private int orderID;//订单ID
	private int stationID;//所属分站ID
	private String stationName;
	private int state;//发票状态
	
	//对应的get、set方法
	public int getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getStationID() {
		return stationID;
	}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}


	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
}
