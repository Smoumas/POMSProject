package poms.center.dao;

import java.util.List;

import poms.center.entity.Company;

public interface ICompanyDao {
	public List<Company> selectCompanyInfo();
}
