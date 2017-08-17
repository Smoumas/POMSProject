package poms.supporter.service;

import java.util.List;

import poms.center.entity.Department;
import poms.center.entity.Log;
import poms.center.entity.Order;
import poms.center.entity.Station;

public interface IQueryService {
	public List<Order> selectExpiredOrder(int stationID);
	public List<Log> selectOperateLog(int stationID,String beginDate,String endDate);
	public List<Station> stationList(int page);
	public List<Department> selectDepartmentList(int stationID, int page);
}
