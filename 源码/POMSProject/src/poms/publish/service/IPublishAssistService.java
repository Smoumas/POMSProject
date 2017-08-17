package poms.publish.service;

import java.util.List;

import poms.center.entity.Advice;
import poms.center.entity.Department;
import poms.center.entity.Operator;
import poms.center.entity.Station;

public interface IPublishAssistService {
	public List<Advice> getUnreadedAdvice(int stationID,int departmentID,int page);
	public int sendAdvice(Advice advice);
	public List<Advice> getReadedAdvice(int stationID,int departmentID,int page);
	public int changePassword(Operator operator,String newPassword);
	public List<Advice> getadviceList(int stationID, int departmentID, int isReaded,int page);
	public List<Department> selectDepartmentList(int stationID, int page);
	public List<Station> stationList(int page);
	public int setAdviceReaded(int adviceID);
}
