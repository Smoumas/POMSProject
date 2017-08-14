package poms.publish.service;

import java.util.Date;
import java.util.List;

import poms.center.entity.DeliverArea;
import poms.center.entity.Order;

public interface IPublishDeliverManageService {
	
	public List<DeliverArea> getDeliverArea(int stationID,int orderID);
	public List<Order> getOrderByID(int stationID,int orderID);
	public int getOrderCount(Date date,int stationID);
	public int finishDeliver(int stationID,int orderID);
	public int correctAddress(int stationID,int orderID,String correctAddress);
}
