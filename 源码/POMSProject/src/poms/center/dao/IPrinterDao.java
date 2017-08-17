package poms.center.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Printer;
import poms.center.entity.PrinterEverydaySummary;

public interface IPrinterDao {
	public int insertPrinter(Printer printer);

	public int updatePrinter(Printer printer);

	public List<Printer> selectPrinterByID(int printerID);
	
	public List<Printer> selectPrinterByName(@Param("printerName") String printerName,@Param("stationID") int stationID,@Param("begin") int begin);

	public List<Printer> selectAllPrinter(@Param("stationID") int stationID,@Param("begin") int begin);

	public int deletePrinterByID(int printerID);

	public List<PrinterEverydaySummary> summaryPrintNumber(@Param("date") Date date, @Param("stationID") int stationID,@Param("begin") int begin);
}