package poms.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.dao.ICompanyDao;
import poms.center.dao.IDeliverAreaDao;
import poms.center.dao.IDepartmentDao;
import poms.center.dao.IDutyDao;
import poms.center.dao.INewsOfficeDao;
import poms.center.dao.ITransferComDao;
import poms.center.dao.IUserModifyDao;
import poms.center.entity.DeliverArea;
import poms.center.entity.Department;
import poms.center.entity.Duty;
import poms.center.entity.NewsOffice;
import poms.center.entity.TransferCom;
import poms.center.entity.UserModify;
@Service("centerDictionaryMaintainService")
public class CenterDictionaryMaintainServiceImpl implements ICenterDictionaryMaintainService{

	@Autowired
	private ICompanyDao companyDao;
	
	@Autowired
	private IUserModifyDao userModifyDao;
	
	@Autowired
	private ITransferComDao transferComDao;
	
	@Autowired
	private IDeliverAreaDao deliverAreaDao;

	@Autowired
	private IDutyDao dutyDao;
	
	@Autowired
	private INewsOfficeDao newsOfficeDao;
	
	@Autowired
	private IDepartmentDao departmentDao;
	
	
	
	@Override
	public int insertDepartment(Department department) {
		// TODO Auto-generated method stub
		int result = departmentDao.insertDepartment(department);
		return result;
	}

	@Override
	public int updateDepartment(Department department) {
		// TODO Auto-generated method stub
		int result = departmentDao.updateDepartment(department);
		return result;
	}

	@Override
	public int deleteDepartment(int departmentID) {
		// TODO Auto-generated method stub
		int result = departmentDao.deleteDepartment(departmentID);
		return result;
	}

	@Override
	public List<Department> selectDepartmentList(int stationID) {
		// TODO Auto-generated method stub
		return departmentDao.selectDepartmentList(stationID);
	}

	@Override
	public List<Department> selectDepartmentByID(int stationID, int departmentID) {
		// TODO Auto-generated method stub
		return departmentDao.selectDepartmentByID(stationID, departmentID);
	}

	@Override
	public List<Department> selectDepartmentListByName(int stationID, String departmentName) {
		// TODO Auto-generated method stub
		return departmentDao.selectDepartmentListByName(stationID, departmentName);
	}

	@Override
	public int insertDuty(Duty duty) {
		// TODO Auto-generated method stub
		int result = dutyDao.insertDuty(duty);
		return result;
	}

	@Override
	public int updateDuty(Duty duty) {
		// TODO Auto-generated method stub
		int result = dutyDao.updateDuty(duty);
		return result;
	}

	@Override
	public int deleteDuty(int dutyType) {
		// TODO Auto-generated method stub
		int result = dutyDao.deleteDuty(dutyType);
		return result;
	}

	@Override
	public List<Duty> selectDutyList() {
		// TODO Auto-generated method stub
		return dutyDao.selectDutyList();
	}

	@Override
	public List<Duty> selectDutyByType(int dutyType) {
		// TODO Auto-generated method stub
		return dutyDao.selectDutyByType(dutyType);
	}

	@Override
	public List<Duty> selectDutyByName(String dutyName) {
		// TODO Auto-generated method stub
		return dutyDao.selectDutyListByName(dutyName);
	}

	@Override
	public int insertTransferCom(TransferCom transferCom) {
		// TODO Auto-generated method stub
		int result = transferComDao.insertTransferCom(transferCom);
		return result;
	}

	@Override
	public int updateTransferCom(TransferCom transferCom) {
		// TODO Auto-generated method stub
		int result = transferComDao.updateTransferCom(transferCom);
		return result;
	}

	@Override
	public int deleteTransferCom(int transferComID) {
		// TODO Auto-generated method stub
		int result = transferComDao.deleteTransferCom(transferComID);
		return result;
	}

	@Override
	public List<TransferCom> selectTransferComList() {
		// TODO Auto-generated method stub
		return transferComDao.selectTransferComList();
	}

	@Override
	public List<TransferCom> selectTransferComByID(int transferComID) {
		// TODO Auto-generated method stub
		return transferComDao.selectTransferComByID(transferComID);
	}

	@Override
	public List<TransferCom> selectTransferComByName(String transferComName) {
		// TODO Auto-generated method stub
		return transferComDao.selectTransferComListByName(transferComName);
	}

	@Override
	public int insertDeliverArea(DeliverArea deliverArea) {
		// TODO Auto-generated method stub
		int result = deliverAreaDao.insertDeliverArea(deliverArea);
		return result;
	}

	@Override
	public int updateDeliverArea(DeliverArea deliverArea) {
		// TODO Auto-generated method stub
		int result = deliverAreaDao.updateDeliverArea(deliverArea);
		return result;
	}

	@Override
	public int deleteDeliverArea(int deliverAreaID) {
		// TODO Auto-generated method stub
		int result = deliverAreaDao.deleteDeliverArea(deliverAreaID);
		return result;
	}

	@Override
	public List<DeliverArea> selectDeliverAreaList(int stationID) {
		// TODO Auto-generated method stub
		return deliverAreaDao.selectDeliverAreaList(stationID);
	}

	@Override
	public List<DeliverArea> selectDeliverAreaByID(int stationID, int deliverAreaID) {
		// TODO Auto-generated method stub
		return deliverAreaDao.selectDeliverAreaByID(stationID, deliverAreaID);
	}

	@Override
	public List<DeliverArea> selecctDeliverAreaListByName(int stationID, String deliverAreaName) {
		// TODO Auto-generated method stub
		return deliverAreaDao.selectDeliverAreaByName(stationID, deliverAreaName);
	}

	@Override
	public int insertUserModify(UserModify userModify) {
		// TODO Auto-generated method stub
		int result = userModifyDao.insertUserModify(userModify);
		return result;
	}

	@Override
	public int updateUserModify(UserModify userModify) {
		// TODO Auto-generated method stub
		int result = userModifyDao.updateUserModify(userModify);
		return result;
	}

	@Override
	public int deleteUserModify(int recordID) {
		// TODO Auto-generated method stub
		int result = userModifyDao.deleteUserModify(recordID);
		return result;
	}

	@Override
	public List<UserModify> selectUserModifyList() {
		// TODO Auto-generated method stub
		return userModifyDao.selectUserModifyList();
	}

	@Override
	public List<UserModify> selectUserModifyByType(int type) {
		// TODO Auto-generated method stub
		return userModifyDao.selectUserModifyListByType(type);
	}

	@Override
	public int insertNewsOffice(NewsOffice newsOffice) {
		// TODO Auto-generated method stub
		return newsOfficeDao.insertNewsOffice(newsOffice);
	}

	@Override
	public int updateNewsOffice(NewsOffice newsOffice) {
		// TODO Auto-generated method stub
		return newsOfficeDao.updateNewsOffice(newsOffice);
	}

	@Override
	public int deleteNewsOffice(int newsOfficeID) {
		// TODO Auto-generated method stub
		return newsOfficeDao.deleteNewsOffice(newsOfficeID);
	}

	@Override
	public List<NewsOffice> selectNewsOfficeList() {
		// TODO Auto-generated method stub
		return newsOfficeDao.selectNewsOfficeList();
	}

	@Override
	public List<NewsOffice> selectNewsOfficeByID(int noID) {
		// TODO Auto-generated method stub
		return newsOfficeDao.selectNewsOfficeByID(noID);
	}

	@Override
	public List<NewsOffice> selectNewsOfficeByName(String noName) {
		// TODO Auto-generated method stub
		return newsOfficeDao.selectNewsOfficeByName(noName);
	}
	
	
}
