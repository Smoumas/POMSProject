package poms.publish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommonConstants;
import poms.center.entity.Advice;
import poms.center.entity.Operator;
import poms.center.service.ICenterAssistService;
import poms.center.service.ICenterPersonManageService;

@Service("publishAssistService")
public class PublishAssistService implements IPublishAssistService{

	@Autowired
	private ICenterAssistService centerAssistService;
	
	@Autowired
	private ICenterPersonManageService centerPersonManageService;
	
	@Override
	public List<Advice> getUnreadedAdvice(int stationID,int departmentID,int page) {
		// TODO Auto-generated method stub
		return centerAssistService.selectAdviceList(stationID, departmentID, CommonConstants.UNREADED,page);
	}

	@Override
	public int sendAdvice(Advice advice) {
		// TODO Auto-generated method stub
		int result = centerAssistService.insertAdvice(advice);
		return result;
	}

	@Override
	public List<Advice> getReadedAdvice(int stationID,int departmentID,int page) {
		// TODO Auto-generated method stub
		return centerAssistService.selectAdviceList(stationID, departmentID, CommonConstants.READED,page);
	}

	@Override
	public int changePassword(Operator operator, String newPassword) {
		// TODO Auto-generated method stub
		operator.setPassword(newPassword);
		return centerPersonManageService.updateOperator(operator);
	}

}
