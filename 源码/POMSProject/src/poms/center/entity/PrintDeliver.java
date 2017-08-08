package poms.center.entity;

public class PrintDeliver {
	//印刷送报表对应属性,维护印刷点送报点关系
	private int printerID;//印刷点ID
	private int deliverPointID;//送报点ID
	private String deliverTime;//送报时间
	private String deliverWay;//送报路线
	private int deliverNum;//每捆报纸份数
	
	//对应的get、set方法
	public int getPrinterID() {
		return printerID;
	}
	public void setPrinterID(int printerID) {
		this.printerID = printerID;
	}
	public int getDeliverPointID() {
		return deliverPointID;
	}
	public void setDeliverPointID(int deliverPointID) {
		this.deliverPointID = deliverPointID;
	}
	public String getDeliverTime() {
		return deliverTime;
	}
	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}
	public String getDeliverWay() {
		return deliverWay;
	}
	public void setDeliverWay(String deliverWay) {
		this.deliverWay = deliverWay;
	}
	public int getDeliverNum() {
		return deliverNum;
	}
	public void setDeliverNum(int deliverNum) {
		this.deliverNum = deliverNum;
	}
}
