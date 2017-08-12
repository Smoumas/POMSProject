package poms.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Invoice;
import poms.center.service.ICenterInvoiceManageService;

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

    public int grant(int stationID,int grantStationID,int invoiceID){
        Invoice invoice = centerInvoiceManageService.selectInvoiceByID(stationID, invoiceID).get(0);
        invoice.setStationID(grantStationID);
    	return centerInvoiceManageService.updateInovice(invoice);
    }

    public List<Invoice> returnService(int stationID){
        List<Invoice> invoiceList = centerInvoiceManageService.selectInoviceList(stationID);
        return invoiceList;
    }
}
