package poms.publish.service;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.service.ICenterOrderService;

@Service("publishOrderChangeService")
public class PublishOrderChangeServiceImpl implements IPublishOrderChangeService{

	@Autowired
	private ICenterOrderService centerOrderService;
	
	@Override
	public int cancelDeleteOrder(int stationID,int orderID) {
		// TODO Auto-generated method stub
		return centerOrderService.cancelDeleteOrder(stationID,orderID);
	}

	@Override
	public int cancelChangeAddress(int stationID,int orderID) {
		// TODO Auto-generated method stub
		return centerOrderService.cancelChangeAddress(stationID,orderID);
	}

	@Override
	public int cancelPostpone(int stationID,int orderID) throws ParseException {
		// TODO Auto-generated method stub
		return centerOrderService.cancelPostpone(stationID,orderID);
	}
	
}
