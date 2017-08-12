package poms.publish.service;

import java.text.ParseException;

public interface IPublishOrderChangeService {
	public int cancelDeleteOrder(int stationID,int orderID);
	public int cancelChangeAddress(int stationID,int orderID);
	public int cancelPostpone(int stationID,int orderID) throws ParseException;
}
