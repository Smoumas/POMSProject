package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.NewspaperPrice;

public interface INewspaperPriceDao {
	
	public int insertNewspaperPrice(NewspaperPrice newspaperPrice);
	public int updateNewspaperPrice(NewspaperPrice newspaperPrice);
	public int deleteNewspaperPrice(@Param("newspaperID")int newspaperID);
	public List<NewspaperPrice> selectNewspaperPriceList(@Param("begin") int begin);
	public List<NewspaperPrice> selectNewspaperPriceByID(@Param("newspaperID")int newspaperID,@Param("begin") int begin);
}
