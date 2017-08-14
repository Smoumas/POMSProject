package poms.finance.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommonConstants;
import poms.center.entity.Advice;
import poms.center.entity.Operator;
import poms.center.service.ICenterAssistService;
import poms.center.service.ICenterPersonManageService;

/**
 * Created by sakamichi on 2017/8/7.
 */
@Service("assistantService")
public class AssistantService {
    // TODO: 2017/8/7  
	
	@Autowired
	private ICenterAssistService centerAssistService;
	
	@Autowired
	private ICenterPersonManageService centerPersonManageService;
	
    public int sendAdvice(Advice advice){
		advice.setSendDate(new Date(System.currentTimeMillis()));
		advice.setIsReaded(0);
    	return centerAssistService.insertAdvice(advice);
    }

    public List<Advice> getUnreadedAdvice(int stationID,int departmentID){
    	return centerAssistService.selectAdviceList(stationID, departmentID, CommonConstants.UNREADED);
    }

    public List<Advice> getReadedAdvice(int stationID,int departmentID){
    	return centerAssistService.selectAdviceList(stationID, departmentID, CommonConstants.READED);
    }
    
    public int changePassword(int operatorID, String newPassword){
    	Operator operator = centerPersonManageService.selectOperatorByID(operatorID).get(0);
		operator.setPassword(newPassword);
		return centerPersonManageService.updateOperator(operator);
    }
}
