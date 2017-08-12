package poms.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.dao.IInvoiceDao;
import poms.center.entity.Invoice;

@Service("centerInvoiceManageService")
public class CenterInvoiceManageServiceImpl implements ICenterInvoiceManageService{

	@Autowired
	private IInvoiceDao invoiceDao;
	
	@Override
	public int insertInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		return invoiceDao.insertInvoice(invoice);
	}

	@Override
	public int deleteInvoice(int invoiceID) {
		// TODO Auto-generated method stub
		return invoiceDao.deleteInvoice(invoiceID);
	}

	@Override
	public int updateInovice(Invoice invoice) {
		// TODO Auto-generated method stub
		return invoiceDao.updateInovice(invoice);
	}

	@Override
	public List<Invoice> selectInoviceList(int stationID) {
		// TODO Auto-generated method stub
		return invoiceDao.selectInoviceList(stationID);
	}

	@Override
	public List<Invoice> selectInvoiceByID(int stationID, int invoiceID) {
		// TODO Auto-generated method stub
		return invoiceDao.selectInoviceByID(stationID, invoiceID);
	}

}
