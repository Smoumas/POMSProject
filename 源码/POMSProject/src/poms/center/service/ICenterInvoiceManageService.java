package poms.center.service;

import java.util.List;


import poms.center.entity.Invoice;

public interface ICenterInvoiceManageService {

	public int insertInvoice(Invoice invoice);
	public int deleteInvoice(int invoiceID);
	public int updateInovice(Invoice invoice);

	public List<Invoice> selectInoviceList();

	public List<Invoice> selectInvoiceByID(int stationID);
}
