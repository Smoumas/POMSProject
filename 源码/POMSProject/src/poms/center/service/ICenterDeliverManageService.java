package poms.center.service;

import java.util.List;

import poms.center.entity.DeliverPoint;

public interface ICenterDeliverManageService {

	public int insertDeliverPoint(DeliverPoint deliverPoint);
	public int updateDeliverPoint(DeliverPoint deliverPoint);
	public List<DeliverPoint> selectDeliverPointByID(int deliverPointID,int page);
	public List<DeliverPoint> selectDeliverPointByName(String deliverPointName,int stationID,int page);
	public List<DeliverPoint> selectAllDeliverPoint(int stationID,int page);
	public int deleteDeliverPointByID(int deliverPointID);
	
}
