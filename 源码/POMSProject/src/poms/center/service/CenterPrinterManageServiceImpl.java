package poms.center.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.dao.IPrintDeliverDao;
import poms.center.dao.IPrinterDao;
import poms.center.entity.PrintDeliver;
import poms.center.entity.Printer;
import poms.center.entity.PrinterEverydaySummary;

@Service("centerPrinterManageService")
public class CenterPrinterManageServiceImpl implements ICenterPrinterManageService{

	@Autowired
	private IPrintDeliverDao printDeliverDao;
	
	@Autowired
	private IPrinterDao printerDao;
	
	@Override
	public int insertPrintDeliver(PrintDeliver printDeliver) {
		// TODO Auto-generated method stub
		return printDeliverDao.insertPrintDeliver(printDeliver);
	}

	@Override
	public int updatePrintDeliver(PrintDeliver printDeliver) {
		// TODO Auto-generated method stub
		return printDeliverDao.updatePrintDeliver(printDeliver);
	}

	@Override
	public List<PrintDeliver> selectPrintDeliverByID(int printerID) {
		// TODO Auto-generated method stub
		return printDeliverDao.selectPrintDeliverByID(printerID);
	}

	@Override
	public List<PrintDeliver> queryAllPrintDeliver(int stationID) {
		// TODO Auto-generated method stub
		return printDeliverDao.selectAllPrintDeliver(stationID);
	}

	@Override
	public int deletePrintDeliverByID(int printerID, int deliverPointID) {
		// TODO Auto-generated method stub
		return printDeliverDao.deletePrintDeliverByID(printerID, deliverPointID);
	}

	@Override
	public int insertPrinter(Printer printer) {
		// TODO Auto-generated method stub
		return printerDao.insertPrinter(printer);
	}

	@Override
	public int updatePrinter(Printer printer) {
		// TODO Auto-generated method stub
		return printerDao.updatePrinter(printer);
	}

	@Override
	public List<Printer> selectPrinterByID(int printerID) {
		// TODO Auto-generated method stub
		return printerDao.selectPrinterByID(printerID);
	}

	@Override
	public List<Printer> queryAllPrinter(int stationID) {
		// TODO Auto-generated method stub
		return printerDao.selectAllPrinter(stationID);
	}

	@Override
	public int deletePrinterByID(int printerID) {
		// TODO Auto-generated method stub
		return printerDao.deletePrinterByID(printerID);
	}

	@Override
	public List<PrinterEverydaySummary> summaryPrintNumber(Date date, int stationID) {
		// TODO Auto-generated method stub
		return printerDao.summaryPrintNumber(date, stationID);
	}

}
