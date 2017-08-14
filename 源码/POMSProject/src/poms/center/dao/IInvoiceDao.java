package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Invoice;

public interface IInvoiceDao {

	public int insertInvoice(Invoice invoice);
	public int deleteInvoice(@Param("invoiceID") int invoiceID);
	public int updateInovice(Invoice invoice);
	
	public List<Invoice> selectInoviceList();
	public List<Invoice> selectInoviceByID(@Param("stationID") int stationID);
}
