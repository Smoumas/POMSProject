package poms.deliver.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Advice;
import poms.center.service.ICenterAssistService;

@Service("deliverAdviceService")
public class DeliverAdviceServiceImpl implements IDeliverAdviceService{

	@Autowired
	private ICenterAssistService centerAssistService;
	
	
	@Override
	public int insertAdvice(Advice advice) {
		return centerAssistService.insertAdvice(advice);
	}

	@Override
	public List<Advice> selectAdviceList(int receiveStationID,int receiveDeptID,int isReaded) {
		// TODO Auto-generated method stub
		return centerAssistService.selectAdviceList(receiveStationID, receiveDeptID, isReaded);
	}
}
