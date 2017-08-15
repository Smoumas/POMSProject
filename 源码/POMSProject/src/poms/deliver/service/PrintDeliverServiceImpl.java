package poms.deliver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.PrintDeliver;
import poms.center.service.ICenterPrinterManageService;

@Service
public class PrintDeliverServiceImpl implements IPrintDeliverService{
	
	@Autowired
	private ICenterPrinterManageService centerPrinterManageService;
	
	
	@Override
	public int insertPrintDeliver(PrintDeliver printDeliver) {
		// TODO Auto-generated method stub
		return centerPrinterManageService.insertPrintDeliver(printDeliver);
	}

	@Override
	public int updatePrintDeliver(PrintDeliver printDeliver) {
		// TODO Auto-generated method stub
		return centerPrinterManageService.updatePrintDeliver(printDeliver);
	}

	@Override
	public List<PrintDeliver> selectPrintDeliverByID(int printerID) {
		// TODO Auto-generated method stub
		return centerPrinterManageService.selectPrintDeliverByID(printerID);
	}

	@Override
	public List<PrintDeliver> queryAllPrintDeliver(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerPrinterManageService.queryAllPrintDeliver(stationID,page);
	}

	@Override
	public int deletePrintDeliverByID(int printerID,int deliverPointID) {
		// TODO Auto-generated method stub
		return centerPrinterManageService.deletePrintDeliverByID(printerID, deliverPointID);
	}

}
