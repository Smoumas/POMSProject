package poms.publish.service;

import org.springframework.stereotype.Service;

import poms.center.entity.DeliverArea;
import poms.center.entity.Order;

@Service("publishDeliverManageService")
public class PublishDeliverManageServiceImpl implements IPublishDeliverManageService{

	@Override
	public DeliverArea getDeliverArea(int orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderByID(int orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getOrderCount(int stationID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int finishDeliver(int orderID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int correctAddress(int orderID, String correctAddress) {
		// TODO Auto-generated method stub
		return 0;
	}

}
