package poms.supporter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import poms.center.entity.Advice;

@Service("adviceService")
public class AdviceServiceImpl implements IAdviceService{

	@Override
	public List<Advice> getUnreadedAdvice(int stationID) {
		// TODO Auto-generated method stub
		Advice advice = new Advice();
		advice.setAdviceID(1);
		advice.setContent("test");
		List<Advice> adviceList = new ArrayList<Advice>();
		adviceList.add(advice);
		return adviceList;
	}

	@Override
	public int sendAdvice(Advice advice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Advice> getReadedAdvice(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

}
