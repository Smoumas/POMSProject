package poms.publish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Advice;
import poms.supporter.service.IAdviceService;

@Service("publishAssistService")
public class PublishAssistService implements IPublishAssistService{

	@Autowired
	private IAdviceService adviceService;
	
	@Override
	public List<Advice> getUnreadedAdvice(int stationID) {
		// TODO Auto-generated method stub
		return adviceService.getUnreadedAdvice(stationID);
	}

	@Override
	public int sendAdvice(Advice advice) {
		// TODO Auto-generated method stub
		int result = adviceService.sendAdvice(advice);
		return result;
	}

	@Override
	public List<Advice> getReadedAdvice(int stationID) {
		// TODO Auto-generated method stub
		return adviceService.getReadedAdvice(stationID);
	}

	@Override
	public int changePassword(int operatorID, String newPassword) {
		// TODO Auto-generated method stub
		return 0;
	}

}
