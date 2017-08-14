package poms.center.entity;

public class Station {
	//分站表对应属性,存储分站信息
	private Integer stationID;//分站ID
	private String stationName;
	private String stationAddress;//分站地址
	private Integer upperID;//上级分站ID
	public Integer getStationID() {
		return stationID;
	}
	public void setStationID(Integer stationID) {
		this.stationID = stationID;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getStationAddress() {
		return stationAddress;
	}
	public void setStationAddress(String stationAddress) {
		this.stationAddress = stationAddress;
	}
	public Integer getUpperID() {
		return upperID;
	}
	public void setUpperID(Integer upperID) {
		this.upperID = upperID;
	}
	
	//对应的get、set方法
	
	
}
