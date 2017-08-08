package poms.center.entity;

public class Station {
	//分站表对应属性,存储分站信息
	private int stationID;//分站ID
	private String stationName;
	private String stationAddress;//分站地址
	private int upperID;//上级分站ID
	
	//对应的get、set方法
	
	public int getStationID() {
		return stationID;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}
	public String getStationAddress() {
		return stationAddress;
	}
	public void setStationAddress(String stationAddress) {
		this.stationAddress = stationAddress;
	}
	public int getUpperID() {
		return upperID;
	}
	public void setUpperID(int upperID) {
		this.upperID = upperID;
	}
	
	
}
