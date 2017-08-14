package poms.center.entity;

public class PrinterEverydaySummary {
	private Integer printerID;		//印刷点ID
	private String printerName;	//印刷点姓名
	private Integer summaryPrintNumber;		//该印刷点当天印刷数
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
	public Integer getSummaryPrintNumber() {
		return summaryPrintNumber;
	}
	public void setSummaryPrintNumber(Integer summaryPrintNumber) {
		this.summaryPrintNumber = summaryPrintNumber;
	}
	
	//对应的get、set方法
	
}
