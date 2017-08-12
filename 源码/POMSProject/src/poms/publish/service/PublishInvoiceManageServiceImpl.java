package poms.publish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Invoice;
import poms.center.service.ICenterInvoiceManageService;

@Service("publishInvoiceManageService")
public class PublishInvoiceManageServiceImpl implements IPublishInvoiceManageService{

	@Autowired
	private ICenterInvoiceManageService centerInvoiceManageService;
	
	@Override
	public int invoiceManage(int stationID,int invoiceID, int state) {
		// TODO Auto-generated method stub
		Invoice invoice = centerInvoiceManageService.selectInvoiceByID(stationID, invoiceID).get(0);
		invoice.setState(state);
		return centerInvoiceManageService.updateInovice(invoice);
	}

}
