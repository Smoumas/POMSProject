package poms.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Invoice;
import poms.center.service.ICenterInvoiceManageService;

import java.util.List;

/**
 * Created by sakamichi on 2017/8/8.
 */
@Service("invoiceService")
public class InvoiceService {

	@Autowired
	private ICenterInvoiceManageService centerInvoiceManageService;
	
    public int register(Invoice invoice){
    	return centerInvoiceManageService.insertInvoice(invoice);
    }

    public int grant(Invoice invoice){
    	return centerInvoiceManageService.updateInovice(invoice);
    }

    public int returnService(Invoice invoice){
        return centerInvoiceManageService.updateInovice(invoice);
    }

    public List<Invoice> query(){
        return centerInvoiceManageService.selectInoviceList();
    }

}
