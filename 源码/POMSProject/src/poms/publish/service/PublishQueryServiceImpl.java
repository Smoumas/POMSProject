package poms.publish.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import poms.center.entity.Customer;
import poms.center.entity.Invoice;
import poms.center.entity.Log;
import poms.center.entity.NewspaperPrice;
import poms.center.entity.Order;

@Service("publishQueryService")
public class PublishQueryServiceImpl implements IPublishQueryService{

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
	public List<Order> selectDeliverOrder(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewspaperPrice getNewspaperPriceByID(int newspaperID) {
		// TODO Auto-generated method stub
		NewspaperPrice newspaperPrice = new NewspaperPrice();
		newspaperPrice.setDayPrice(1);
		newspaperPrice.setMouthPrice(2);
		newspaperPrice.setSeasonPrice(3);
		newspaperPrice.setHalfYearPrice(4);
		newspaperPrice.setYearPrice(5);
		newspaperPrice.setBaseDiscount(0.6f);
		return newspaperPrice;
	}

	@Override
	public List<Customer> getStationCustomer(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Log> getLog(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getPaymentList(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrderList(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getExpiredList(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getPromptList(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
