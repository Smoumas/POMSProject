package poms.center.entity;

public class Printer {
	//印刷点表,维护印刷点基本信息
	private Integer printerID;//印刷点ID
	private String printerName;//印刷点名称
	private String printerAddress;//印刷点地址
	private Integer stationID;//所属分站ID
	public Integer getPrinterID() {
		return printerID;
	}
	public void setPrinterID(Integer printerID) {
		this.printerID = printerID;
	}
	public String getPrinterName() {
		return printerName;
	}
	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}
	public String getPrinterAddress() {
		return printerAddress;
	}
	public void setPrinterAddress(String printerAddress) {
		this.printerAddress = printerAddress;
	}
	public Integer getStationID() {
		return stationID;
	}
	public void setStationID(Integer stationID) {
		this.stationID = stationID;
	}
	
	//对应的get、set方法
	
}
