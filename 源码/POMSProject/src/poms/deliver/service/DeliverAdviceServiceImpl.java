package poms.deliver.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommonConstants;
import poms.center.entity.Advice;
import poms.center.entity.Department;
import poms.center.entity.Station;
import poms.center.service.ICenterAssistService;
import poms.center.service.ICenterDictionaryMaintainService;

@Service("deliverAdviceService")
public class DeliverAdviceServiceImpl implements IDeliverAdviceService{

	@Autowired
	private ICenterAssistService centerAssistService;
	
	@Autowired
	private ICenterDictionaryMaintainService centerDictionaryMaintainService;
	
	@Override
	public int insertAdvice(Advice advice) {
		return centerAssistService.insertAdvice(advice);
	}

	@Override
	public List<Advice> selectAdviceList(int receiveStationID,int receiveDeptID,int isReaded,int page) {
		// TODO Auto-generated method stub
		return centerAssistService.selectAdviceList(receiveStationID, receiveDeptID, isReaded,page);
	}

	@Override
	public List<Station> stationList(int page) {
		// TODO Auto-generated method stub
		return centerDictionaryMaintainService.stationList(page);
	}

	@Override
	public List<Department> selectDepartmentList(int stationID, int page) {
		// TODO Auto-generated method stub
		return centerDictionaryMaintainService.selectDepartmentList(stationID, page);
	}

	@Override
	public int setAdviceReaded(int adviceID) {
		// TODO Auto-generated method stub
		return centerAssistService.setAdviceReaded(adviceID);
	}
}
