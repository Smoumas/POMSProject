package poms.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.dao.IInvoiceDao;
import poms.center.entity.Invoice;
import poms.center.service.ICenterInvoiceManageService;

import java.util.List;

/**
 * Created by sakamichi on 2017/8/8.
 */
@Service("invoiceService")
public class InvoiceService implements IInvoiceService {

	@Autowired
	private ICenterInvoiceManageService centerInvoiceManageService;

    @Override
    public int register(Invoice invoice){
    	return centerInvoiceManageService.insertInvoice(invoice);
    }

    @Override
    public int grant(Invoice invoice){
    	return centerInvoiceManageService.updateInovice(invoice);
    }

    @Override
    public int returnService(Invoice invoice){
        return centerInvoiceManageService.updateInovice(invoice);
    }

    @Override
    public List<Invoice> query(int page){
        return centerInvoiceManageService.selectInoviceList(page);
    }

}
