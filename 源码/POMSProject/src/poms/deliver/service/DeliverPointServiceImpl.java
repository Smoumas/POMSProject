package poms.deliver.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.DeliverPoint;
import poms.center.service.ICenterDeliverManageService;

@Service("deliverPointService")
public class DeliverPointServiceImpl implements IDeliverPointService{
	
	@Autowired
	private ICenterDeliverManageService centerDeliverManageService;
	
	@Override
	public int insertDeliverPoint(DeliverPoint deliverPoint) {
		return centerDeliverManageService.insertDeliverPoint(deliverPoint);
	}

	@Override
	public int updateDeliverPoint(DeliverPoint deliverPoint) {
		return centerDeliverManageService.updateDeliverPoint(deliverPoint);
	}

	@Override
	public List<DeliverPoint> selectDeliverPointByID(int deliverPointID,int page) {
		return centerDeliverManageService.selectDeliverPointByID(deliverPointID,page);
	}

	@Override
	public List<DeliverPoint> queryAllDeliverPoint(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerDeliverManageService.selectAllDeliverPoint(stationID,page);
	}

	@Override
	public int deleteDeliverPointByID(int deliverPointID) {
		// TODO Auto-generated method stub
		return centerDeliverManageService.deleteDeliverPointByID(deliverPointID);
	}

}
