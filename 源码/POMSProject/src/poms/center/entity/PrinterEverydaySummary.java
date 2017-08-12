package poms.center.entity;

public class PrinterEverydaySummary {
	private int printerID;		//印刷点ID
	private String printerName;	//印刷点姓名
	private int summaryPrintNumber;		//该印刷点当天印刷数
	
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
	public int getSummary() {
		return summaryPrintNumber;
	}
	public void setSummary(int summary) {
		this.summaryPrintNumber = summary;
	}
}
