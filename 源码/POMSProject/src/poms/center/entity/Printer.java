package poms.center.entity;

public class Printer {
	//印刷点表,维护印刷点基本信息
	private int printerID;//印刷点ID
	private String printerName;//印刷点名称
	private String printerAddress;//印刷点地址
	private int stationID;//所属分站ID
	
	//对应的get、set方法
	public int getPrinterID() {
		return printerID;
	}
	public void setPrinterID(int printerID) {
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
	public int getStationID() {
		return stationID;
	}
	public void setStationID(int stationID) {
		this.stationID = stationID;
	}
}
