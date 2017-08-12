package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.PrintDeliver;

public interface IPrintDeliverDao {
	public int insertPrintDeliver(PrintDeliver printDeliver);
	public int updatePrintDeliver(PrintDeliver printDeliver);
	public List<PrintDeliver> selectPrintDeliverByID(int printID);
	public List<PrintDeliver> selectAllPrintDeliver(int stationID);
	public int deletePrintDeliverByID(@Param("printerID") int printerID,@Param("deliverPointID") int deliverPointID);
	
}
