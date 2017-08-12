package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Newspaper;

public interface INewspaperDao {
	
	public int insertNewspaper(Newspaper newspaper);
	public int updateNewspaper(Newspaper newspaper);
	public int deleteNewspaper(@Param("newspaperID") int newspaperID);
	public List<Newspaper> selectNewspaperList();
	public List<Newspaper> selectNewspaperByID(@Param("newspaperID") int newspaperID);
	public List<Newspaper> selectNewspaperByNO(@Param("noID") int noID);
	public List<Newspaper> selectNewspaperByName(@Param("newspaperName") String newspaperName);
	
	
}
