package poms.publish.service;

public interface IPublishOrderChangeService {
	public int cancelDeleteOrder(int orderID);
	public int cancelChangeAddress(int orderID);
	public int cancelPostpone(int orderID);
}
