package poms.center.service;

import java.util.Date;
import java.util.List;

import poms.center.entity.PrintDeliver;
import poms.center.entity.Printer;
import poms.center.entity.PrinterEverydaySummary;

public interface ICenterPrinterManageService {
	
	public int insertPrintDeliver(PrintDeliver printDeliver);

	public int updatePrintDeliver(PrintDeliver printDeliver);

	public List<PrintDeliver> selectPrintDeliverByID(int printerID);

	public List<PrintDeliver> queryAllPrintDeliver(int stationID,int page);

	public int deletePrintDeliverByID(int printerID,int deliverPointID);
	
	public int insertPrinter(Printer printer);
	public int updatePrinter(Printer printer);
	public List<Printer> selectPrinterByID(int printerID);
	public List<Printer> queryAllPrinter(int stationID,int page);
	public int deletePrinterByID(int printerID);
	
	public List<PrinterEverydaySummary> summaryPrintNumber(Date date, int stationID,int page);

	List<Printer> selectPrinterByName(String printerName,int stationID, int page);
	
}
