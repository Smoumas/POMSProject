package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.NewsOffice;

public interface INewsOfficeDao {
	
	public int insertNewsOffice(NewsOffice newsOffice);
	public int updateNewsOffice(NewsOffice newsOffice);
	public int deleteNewsOffice(@Param("noID") int noID);
	public List<NewsOffice> selectNewsOfficeList(@Param("begin") int begin);
	public List<NewsOffice> selectNewsOfficeByID(@Param("noID") int noID,@Param("begin") int begin);
	public List<NewsOffice> selectNewsOfficeByName(@Param("noName") String noName,@Param("begin") int begin);
}
