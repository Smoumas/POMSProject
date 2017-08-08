package poms.publish.service;

import poms.center.entity.DeliverArea;
import poms.center.entity.Order;

public interface IPublishDeliverManageService {
	
	public DeliverArea getDeliverArea(int orderID);
	public Order getOrderByID(int orderID);
	public int getOrderCount(int stationID);
	public int finishDeliver(int orderID);
	public int correctAddress(int orderID,String correctAddress);
}
