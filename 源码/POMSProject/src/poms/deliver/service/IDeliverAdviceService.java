package poms.deliver.service;

import java.util.List;

import poms.center.entity.Advice;
import poms.center.entity.Department;
import poms.center.entity.Station;

public interface IDeliverAdviceService {
	public int insertAdvice(Advice advice);

	public List<Advice> selectAdviceList(int receiveStationID,int receiveDeptID,int isReaded,int page);

	public List<Station> stationList(int page);

	public List<Department> selectDepartmentList(int stationID, int page);

	public int setAdviceReaded(int adviceID);
}
