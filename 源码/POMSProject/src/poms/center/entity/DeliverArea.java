package poms.center.entity;

public class DeliverArea {
	//投递段表,维护投递段的基本信息
	private Integer deliverAreaID;//投递段ID
	private String deliverAreaValue;//投递站地址
	private Integer stationID;//所属分站ID
	private Integer deliverPointID;
	
	
	
	public Integer getDeliverPointID() {
		return deliverPointID;
	}
	public void setDeliverPointID(int deliverPointID) {
		this.deliverPointID = deliverPointID;
	}
	//对应的get、set方法
	public Integer getDeliverAreaID() {
		return deliverAreaID;
	}
	public void setDeliverAreaID(int deliverAreaID) {
		this.deliverAreaID = deliverAreaID;
	}
	public String getDeliverAreaValue() {
		return deliverAreaValue;
	}
	public void setDeliverAreaValue(String deliverAreaValue) {
		this.deliverAreaValue = deliverAreaValue;
	}
	public Integer getStationID() {
		return stationID;
	}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}
}
