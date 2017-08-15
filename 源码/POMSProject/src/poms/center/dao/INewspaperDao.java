package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Newspaper;

public interface INewspaperDao {
	
	public int insertNewspaper(Newspaper newspaper);
	public int updateNewspaper(Newspaper newspaper);
	public int deleteNewspaper(@Param("newspaperID") int newspaperID);
	public List<Newspaper> selectNewspaperList(@Param("begin") int begin);
	public List<Newspaper> selectNewspaperByID(@Param("newspaperID") int newspaperID,@Param("begin") int begin);
	public List<Newspaper> selectNewspaperByNO(@Param("noID") int noID,@Param("begin") int begin);
	public List<Newspaper> selectNewspaperByName(@Param("newspaperName") String newspaperName,@Param("begin") int begin);
	
	
}
