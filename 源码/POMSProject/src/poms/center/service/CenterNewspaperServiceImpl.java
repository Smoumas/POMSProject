package poms.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.dao.INewspaperDao;
import poms.center.dao.INewspaperPriceDao;
import poms.center.entity.Newspaper;
import poms.center.entity.NewspaperPrice;

@Service("centerNewspaperService")
public class CenterNewspaperServiceImpl implements ICenterNewspaperService{

	@Autowired
	private INewspaperDao newspaperDao;
	
	@Autowired
	private INewspaperPriceDao newspaperPriceDao;
	
	@Override
	public int insertNewspaper(Newspaper newspaper) {
		// TODO Auto-generated method stub
		return newspaperDao.insertNewspaper(newspaper);
	}

	@Override
	public int updateNewspaper(Newspaper newspaper) {
		// TODO Auto-generated method stub
		return newspaperDao.updateNewspaper(newspaper);
	}

	@Override
	public int deleteNewspaper(int newspaperID) {
		// TODO Auto-generated method stub
		return newspaperDao.deleteNewspaper(newspaperID);
	}

	@Override
	public List<Newspaper> selectNewspaperList() {
		// TODO Auto-generated method stub
		return newspaperDao.selectNewspaperList();
	}

	@Override
	public List<Newspaper> selectNewspaperByID(int newspaperID) {
		// TODO Auto-generated method stub
		return newspaperDao.selectNewspaperByID(newspaperID);
	}

	@Override
	public List<Newspaper> selectNewspaperListByName(String newspaperName) {
		// TODO Auto-generated method stub
		return newspaperDao.selectNewspaperByName(newspaperName);
	}

	@Override
	public List<Newspaper> selectNewspaperByNO(int noID) {
		// TODO Auto-generated method stub
		return newspaperDao.selectNewspaperByNO(noID);
	}

	@Override
	public int insertNewspaperPrice(NewspaperPrice newspaperPrice) {
		// TODO Auto-generated method stub
		return newspaperPriceDao.insertNewspaperPrice(newspaperPrice);
	}

	@Override
	public int updateNewspaperPrice(NewspaperPrice newspaperPrice) {
		// TODO Auto-generated method stub
		return newspaperPriceDao.updateNewspaperPrice(newspaperPrice);
	}

	@Override
	public int deleteNewspaperPrice(int newspaperID) {
		// TODO Auto-generated method stub
		return newspaperPriceDao.deleteNewspaperPrice(newspaperID);
	}

	@Override
	public List<NewspaperPrice> selectNewspaperPriceList() {
		// TODO Auto-generated method stub
		return newspaperPriceDao.selectNewspaperPriceList();
	}

	@Override
	public List<NewspaperPrice> selectNewspaperPriceByID(int newspaperID) {
		// TODO Auto-generated method stub
		return newspaperPriceDao.selectNewspaperPriceByID(newspaperID);
	}
	
}
