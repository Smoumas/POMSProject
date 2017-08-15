package poms.publish.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Customer;
import poms.center.entity.Invoice;
import poms.center.entity.Log;
import poms.center.entity.NewspaperPrice;
import poms.center.entity.Order;
import poms.center.entity.PromptOrder;
import poms.center.service.ICenterCustomerService;
import poms.center.service.ICenterNewspaperService;
import poms.center.service.ICenterOrderService;

@Service("publishQueryService")
public class PublishQueryServiceImpl implements IPublishQueryService{

	@Autowired
	private ICenterNewspaperService centerNewspaperService;
	
	@Autowired
	private ICenterCustomerService centerCustomerService;
	
	@Autowired
	private ICenterOrderService centerOrderService;
	
	@Override
	public List<Invoice> selectInvoiceByDate(Date beginDate, Date endDate, int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> selectReceiptList(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> selectRefundList(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> selectDeliverOrder(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerOrderService.selectAllOrder(stationID, page);
	}

	@Override
	public List<NewspaperPrice> getNewspaperPriceByID(int newspaperID,int page) {
		// TODO Auto-generated method stub
		return centerNewspaperService.selectNewspaperPriceByID(newspaperID,page);
	}

	@Override
	public List<Customer> getStationCustomer(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerCustomerService.selectCustomerList(stationID,page);
	}

	@Override
	public List<Log> getLog(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getPaymentList(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerOrderService.selectAllOrder(stationID, page);
	}

	@Override
	public List<Order> getOrderList(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerOrderService.selectAllOrder(stationID,page);
	}

	@Override
	public List<Order> getExpiredList(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PromptOrder> getPromptList(int stationID) {
		// TODO Auto-generated method stub
		return centerOrderService.selectPromptOrderList(stationID);
	}
	
}
