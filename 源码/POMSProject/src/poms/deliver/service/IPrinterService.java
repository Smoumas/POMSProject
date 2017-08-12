package poms.deliver.service;

import java.util.List;

import poms.center.entity.Printer;

public interface IPrinterService {
	public int insertPrinter(Printer printer);
	public int updatePrinter(Printer printer);
	public List<Printer> selectPrinterByID(int printerID);
	public List<Printer> queryAllPrinter(int stationID);
	public int deletePrinterByID(int printerID);
}
