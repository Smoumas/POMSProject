package poms.publish.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.DeliverArea;
import poms.center.entity.Order;
import poms.center.service.ICenterAssistService;
import poms.center.service.ICenterDictionaryMaintainService;
import poms.center.service.ICenterQueryService;

@Service("publishDeliverManageService")
public class PublishDeliverManageServiceImpl implements IPublishDeliverManageService{

	@Autowired
	private ICenterQueryService centerQueryService;
	
	@Autowired
	private ICenterAssistService centerAssistService;

	@Autowired
	private ICenterDictionaryMaintainService centerDictionaryMaintainService;
	
	
	@Override
	public List<DeliverArea> getDeliverArea(int stationID,int orderID,int page) {
		// TODO Auto-generated method stub
		int deliverAreaID = centerQueryService.selectOrderByID(stationID, orderID).get(0).getDeliverAreaID();
		return centerDictionaryMaintainService.selectDeliverAreaByID(stationID, deliverAreaID,page);
	}

	@Override
	public List<Order> getOrderByID(int stationID,int orderID) {
		// TODO Auto-generated method stub
		return centerQueryService.selectOrderByID(stationID, orderID);
	}

	@Override
	public int getOrderCount(Date date,int stationID) {
		// TODO Auto-generated method stub
		return centerQueryService.orderCount(stationID, date);
	}

	@Override
	public int finishDeliver(int stationID,int orderID) {
		// TODO Auto-generated method stub
		return centerAssistService.finishDeliverd(stationID, orderID);
	}

	@Override
	public int correctAddress(int stationID,int orderID, String correctAddress) {
		// TODO Auto-generated method stub
		return centerAssistService.correctOrderAddress(stationID, orderID, correctAddress);
	}

}
