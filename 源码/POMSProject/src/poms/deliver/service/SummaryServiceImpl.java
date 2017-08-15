package poms.deliver.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.PrinterEverydaySummary;
import poms.center.service.ICenterPrinterManageService;

@Service
public class SummaryServiceImpl implements ISummaryService {

	@Autowired
	private ICenterPrinterManageService centerPrinterManageService;
	
	@Override
	public List<PrinterEverydaySummary> summaryPrintNumber(Date date, int stationID,int page) {
		// TODO Auto-generated method stub
		return centerPrinterManageService.summaryPrintNumber(date, stationID,page);
	}
}
