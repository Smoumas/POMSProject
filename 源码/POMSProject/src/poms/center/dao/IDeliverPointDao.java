package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.DeliverPoint;


public interface IDeliverPointDao {
	
	public int insertDeliverPoint(DeliverPoint deliverPoint);
	public int updateDeliverPoint(DeliverPoint deliverPoint);
	public List<DeliverPoint> selectDeliverPointByID(@Param("deliverPointID") int deliverPointID,@Param("begin") int begin);
	public List<DeliverPoint> selectDeliverPointByName(@Param("deliverPointName") String deliverPointName,@Param("stationID") int stationID,@Param("begin") int begin);
	public List<DeliverPoint> selectAllDeliverPoint(@Param("stationID")int stationID,@Param("begin") int begin);
	public int deleteDeliverPointByID(int deliverPointID);

}
