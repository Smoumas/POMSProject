package poms.deliver.service;

import java.util.List;

import poms.center.entity.DeliverPoint;

public interface IDeliverPointService {
	public int insertDeliverPoint(DeliverPoint deliverPoint);

	public int updateDeliverPoint(DeliverPoint deliverPoint);

	public List<DeliverPoint> selectDeliverPointByID(int deliverPointID,int page);
	
	public List<DeliverPoint> selectDeliverPointByName(String deliverPointName,int stationID,int page);

	public List<DeliverPoint> queryAllDeliverPoint(int stationID,int page);

	public int deleteDeliverPointByID(int deliverPointID);
}
