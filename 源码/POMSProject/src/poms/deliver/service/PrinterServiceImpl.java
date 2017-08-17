package poms.deliver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Printer;
import poms.center.service.ICenterPrinterManageService;

@Service
public class PrinterServiceImpl implements IPrinterService {

	@Autowired
	private ICenterPrinterManageService centerPrinterMangeService;
	
	
	@Override
	public int insertPrinter(Printer printer) {
		// TODO Auto-generated method stub
		return centerPrinterMangeService.insertPrinter(printer);
	}

	@Override
	public int updatePrinter(Printer printer) {
		// TODO Auto-generated method stub
		return centerPrinterMangeService.updatePrinter(printer);
	}

	@Override
	public List<Printer> selectPrinterByID(int printerID) {
		// TODO Auto-generated method stub
		return centerPrinterMangeService.selectPrinterByID(printerID);
	}

	@Override
	public List<Printer> queryAllPrinter(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerPrinterMangeService.queryAllPrinter(stationID,page);
	}

	@Override
	public int deletePrinterByID(int printerID) {
		// TODO Auto-generated method stub
		return centerPrinterMangeService.deletePrinterByID(printerID);
	}

	@Override
	public List<Printer> selectPrinterByName(String printerName,int stationID, int page) {
		// TODO Auto-generated method stub
		return centerPrinterMangeService.selectPrinterByName(printerName, stationID, page);
	}

}
