package poms.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommonConstants;
import poms.center.dao.IDeliverPointDao;
import poms.center.entity.DeliverPoint;

@Service("centerDeliverManageService")
public class CenterDeliverManageServiceImpl implements ICenterDeliverManageService{

	@Autowired
	private IDeliverPointDao deliverPointDao;
	
	
	
	
	@Override
	public int insertDeliverPoint(DeliverPoint deliverPoint) {
		// TODO Auto-generated method stub
		return deliverPointDao.insertDeliverPoint(deliverPoint);
	}

	@Override
	public int updateDeliverPoint(DeliverPoint deliverPoint) {
		// TODO Auto-generated method stub
		return deliverPointDao.updateDeliverPoint(deliverPoint);
	}

	@Override
	public List<DeliverPoint> selectDeliverPointByID(int deliverPointID,int page) {
		// TODO Auto-generated method stub
		return deliverPointDao.selectDeliverPointByID(deliverPointID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<DeliverPoint> selectAllDeliverPoint(int stationID,int page) {
		// TODO Auto-generated method stub
		return deliverPointDao.selectAllDeliverPoint(stationID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public int deleteDeliverPointByID(int deliverPointID) {
		// TODO Auto-generated method stub
		return deliverPointDao.deleteDeliverPointByID(deliverPointID);
	}

	
}
