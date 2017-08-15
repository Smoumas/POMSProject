package poms.center.service;

import java.util.List;

import poms.center.entity.Newspaper;
import poms.center.entity.NewspaperPrice;

public interface ICenterNewspaperService {
	
	public int insertNewspaper(Newspaper newspaper);
	public int updateNewspaper(Newspaper newspaper);
	public int deleteNewspaper(int newspaperID);
	public List<Newspaper> selectNewspaperList(int page);
	public List<Newspaper> selectNewspaperByID(int newspaperID,int page);
	public List<Newspaper> selectNewspaperListByName(String newspaperName,int page);
	public List<Newspaper> selectNewspaperByNO(int noID,int page);
	
	public int insertNewspaperPrice(NewspaperPrice newspaperPrice);
	public int updateNewspaperPrice(NewspaperPrice newspaperPrice);
	public int deleteNewspaperPrice(int newspaperID);
	public List<NewspaperPrice> selectNewspaperPriceList(int page);
	public List<NewspaperPrice> selectNewspaperPriceByID(int newspaperID,int page);
	
}
