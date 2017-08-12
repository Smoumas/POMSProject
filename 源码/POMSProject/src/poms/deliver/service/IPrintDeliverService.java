package poms.deliver.service;

import java.util.List;

import poms.center.entity.PrintDeliver;

public interface IPrintDeliverService {
	public int insertPrintDeliver(PrintDeliver printDeliver);

	public int updatePrintDeliver(PrintDeliver printDeliver);

	public List<PrintDeliver> selectPrintDeliverByID(int printerID);

	public List<PrintDeliver> queryAllPrintDeliver(int stationID);

	public int deletePrintDeliverByID(int printerID,int deliverPointID);
}
