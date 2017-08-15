package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Station;

public interface IStationDao {

	public List<Station> stationList(@Param("begin") int begin);
}
