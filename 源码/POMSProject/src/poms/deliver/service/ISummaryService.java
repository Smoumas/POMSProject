package poms.deliver.service;

import java.util.Date;
import java.util.List;

import poms.center.entity.PrinterEverydaySummary;

public interface ISummaryService {
	public List<PrinterEverydaySummary> summaryPrintNumber(Date date, int stationID);
}
