package poms.center.service;

import java.util.List;

import poms.center.entity.Advice;

public interface ICenterService {
	public List<Advice> getUnreadedAdvice(int stationID);
}
