package poms.center.entity;

public class DeliverArea {
	//投递段表,维护投递段的基本信息
	private int deliverAreaID;//投递段ID
	private String deliverAreaValue;//投递站地址
	private int stationID;//所属分站ID
	
	//对应的get、set方法
	public int getDeliverAreaID() {
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
	public int getStationID() {
		return stationID;
	}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}
}
