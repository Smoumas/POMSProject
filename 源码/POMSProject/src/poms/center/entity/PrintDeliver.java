package poms.center.entity;

public class PrintDeliver {
	//印刷送报表对应属性,维护印刷点送报点关系
	private Integer printerID;//印刷点ID
	private Integer deliverPointID;//送报点ID
	private String deliverTime;//送报时间
	private String deliverWay;//送报路线
	private Integer deliverNum;//每捆报纸份数
	public Integer getPrinterID() {
		return printerID;
	}
	public void setPrinterID(Integer printerID) {
		this.printerID = printerID;
	}
	public Integer getDeliverPointID() {
		return deliverPointID;
	}
	public void setDeliverPointID(Integer deliverPointID) {
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
	public Integer getDeliverNum() {
		return deliverNum;
	}
	public void setDeliverNum(Integer deliverNum) {
		this.deliverNum = deliverNum;
	}
	
	//对应的get、set方法
	
}
