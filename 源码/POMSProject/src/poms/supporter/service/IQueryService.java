package poms.supporter.service;

import java.util.List;

import poms.center.entity.Log;
import poms.center.entity.Order;

public interface IQueryService {
	public List<Order> selectExpiredOrder(int stationID);
	public List<Log> selectOperateLog(int stationID,String beginDate,String endDate);
}
