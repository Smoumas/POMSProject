package poms.finance.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommonConstants;
import poms.center.entity.Advice;
import poms.center.entity.Department;
import poms.center.entity.Duty;
import poms.center.entity.Operator;
import poms.center.entity.Station;
import poms.center.service.ICenterAssistService;
import poms.center.service.ICenterDictionaryMaintainService;
import poms.center.service.ICenterPersonManageService;

/**
 * Created by sakamichi on 2017/8/7.
 */
@Service("assistantService")
public class AssistantService implements IAssistantService{
    // TODO: 2017/8/7  
	
	@Autowired
	private ICenterAssistService centerAssistService;
	
	@Autowired
	private ICenterPersonManageService centerPersonManageService;

	@Autowired
	private ICenterDictionaryMaintainService centerDictionaryMaintainService;
	
	@Override
    public int sendAdvice(Advice advice){
		advice.setSendDate(new Date(System.currentTimeMillis()));
		advice.setIsReaded(0);
    	return centerAssistService.insertAdvice(advice);
    }

	@Override
    public List<Advice> getUnreadedAdvice(int stationID,int departmentID,int page){
    	return centerAssistService.selectAdviceList(stationID, departmentID, CommonConstants.UNREADED,page);
    }

	@Override
    public List<Advice> getReadedAdvice(int stationID,int departmentID,int page){
    	return centerAssistService.selectAdviceList(stationID, departmentID, CommonConstants.READED,page);
    }

	@Override
    public int changePassword(int operatorID, String newPassword){
    	Operator operator = centerPersonManageService.selectOperatorByID(operatorID).get(0);
		operator.setPassword(newPassword);
		return centerPersonManageService.updateOperator(operator);
    }

	public List<Department> selectDepartmentList(int stationID, int page) {
		// TODO Auto-generated method stub
		return centerDictionaryMaintainService.selectDepartmentList(stationID, page);
	}

	public List<Station> stationList(int page) {
		// TODO Auto-generated method stub
		return centerDictionaryMaintainService.stationList(page);
	}

	public List<Duty> selectDutyList(int departmentID, int page) {
		// TODO Auto-generated method stub
		return centerDictionaryMaintainService.selectDutyList(departmentID, page);
	}

	public List<Advice> getadviceList(int stationID, int departmentID, int isReaded, int page) {
		// TODO Auto-generated method stub
		return centerAssistService.selectAdviceList(stationID, departmentID, isReaded, page);
	}

	public int setAdviceReaded(int adviceID) {
		// TODO Auto-generated method stub
		return centerAssistService.setAdviceReaded(adviceID);
	}
	
}
