package poms.deliver.service;

import java.util.List;

import poms.center.entity.DeliverPoint;

public interface IDeliverPointService {
	public int insertDeliverPoint(DeliverPoint deliverPoint);

	public int updateDeliverPoint(DeliverPoint deliverPoint);

	public List<DeliverPoint> selectDeliverPointByID(int deliverPointID);

	public List<DeliverPoint> queryAllDeliverPoint(int stationID);

	public int deleteDeliverPointByID(int deliverPointID);
}
