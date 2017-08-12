package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.DeliverArea;

public interface IDeliverAreaDao {
	public int insertDeliverArea(DeliverArea deliverArea);
	public int updateDeliverArea(DeliverArea deliverArea);
	public int deleteDeliverArea(@Param("deliverAreaID") int deliverAreaID);
	public List<DeliverArea> selectDeliverAreaList(@Param("stationID") int stationID);
	public List<DeliverArea> selectDeliverAreaByID(@Param("stationID") int stationID,@Param("deliverAreaID") int deliverAreaID);
	public List<DeliverArea> selectDeliverAreaByName(@Param("stationID") int stationID, @Param("deliverAreaValue")String deliverAreaValue);
}
