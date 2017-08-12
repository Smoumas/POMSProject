package poms.publish.service;

import java.util.List;

import poms.center.entity.Advice;

public interface IPublishAssistService {
	public List<Advice> getUnreadedAdvice(int stationID,int departmentID);
	public int sendAdvice(Advice advice);
	public List<Advice> getReadedAdvice(int stationID,int departmentID);
	public int changePassword(int operatorID,String newPassword);
}
