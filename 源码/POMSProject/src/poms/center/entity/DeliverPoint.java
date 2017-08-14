package poms.center.entity;

public class DeliverPoint {
	//送报点表对应属性,维护送报点基本信息
	private Integer deliverPointID;//送报点ID
	private String deliverPointName;//送报点名称
	private String deliverPointAddress;//送报点地址
	private Integer stationID;//所属分站ID
	public Integer getDeliverPointID() {
		return deliverPointID;
	}
	public void setDeliverPointID(Integer deliverPointID) {
		this.deliverPointID = deliverPointID;
	}
	public String getDeliverPointName() {
		return deliverPointName;
	}
	public void setDeliverPointName(String deliverPointName) {
		this.deliverPointName = deliverPointName;
	}
	public String getDeliverPointAddress() {
		return deliverPointAddress;
	}
	public void setDeliverPointAddress(String deliverPointAddress) {
		this.deliverPointAddress = deliverPointAddress;
	}
	public Integer getStationID() {
		return stationID;
	}
	public void setStationID(Integer stationID) {
		this.stationID = stationID;
	}
	
	//对应的get、set方法
	
}
