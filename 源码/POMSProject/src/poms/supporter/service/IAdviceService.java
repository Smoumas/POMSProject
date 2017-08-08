package poms.supporter.service;

import java.util.List;

import poms.center.entity.Advice;

public interface IAdviceService {
	public List<Advice> getUnreadedAdvice(int stationID);
	public int sendAdvice(Advice advice);
	public List<Advice> getReadedAdvice(int stationID);
}
