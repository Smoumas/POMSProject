package poms.supporter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommonConstants;
import poms.center.entity.Advice;
import poms.center.service.ICenterAssistService;

@Service("adviceService")
public class AdviceServiceImpl implements IAdviceService{

	@Autowired
	private ICenterAssistService centerAssistService;
	
	
	@Override
	public List<Advice> getUnreadedAdvice(int stationID,int departmentID) {
		// TODO Auto-generated method stub
		return centerAssistService.selectAdviceList(stationID, departmentID, CommonConstants.UNREADED);
	}

	@Override
	public int sendAdvice(Advice advice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Advice> getReadedAdvice(int stationID,int departmentID) {
		// TODO Auto-generated method stub
		return centerAssistService.selectAdviceList(stationID, departmentID, CommonConstants.READED);
	}

}
