package poms.center.service;

import java.util.List;

import poms.center.entity.DeliverArea;
import poms.center.entity.Department;
import poms.center.entity.Duty;
import poms.center.entity.NewsOffice;
import poms.center.entity.TransferCom;
import poms.center.entity.UserModify;

public interface ICenterDictionaryMaintainService {
	
	public int insertDepartment(Department department);
	public int updateDepartment(Department department);
	public int deleteDepartment(int departmentID);
	public List<Department> selectDepartmentList(int stationID);
	public List<Department> selectDepartmentByID(int stationID,int departmentID);
	public List<Department> selectDepartmentListByName(int stationID,String departmentName);
	
	public int insertDuty(Duty duty);
	public int updateDuty(Duty duty);
	public int deleteDuty(int dutyType);
	public List<Duty> selectDutyList();
	public List<Duty> selectDutyByType(int dutyType);
	public List<Duty> selectDutyByName(String dutyName);
	
	public int insertTransferCom(TransferCom transferCom);
	public int updateTransferCom(TransferCom transferCom);
	public int deleteTransferCom(int transferComID);
	public List<TransferCom> selectTransferComList();
	public List<TransferCom> selectTransferComByID(int transferComID);
	public List<TransferCom> selectTransferComByName(String transferComName);
	
	public int insertDeliverArea(DeliverArea deliverArea);
	public int updateDeliverArea(DeliverArea deliverArea);
	public int deleteDeliverArea(int deliverAreaID);
	public List<DeliverArea> selectDeliverAreaList(int stationID);
	public List<DeliverArea> selectDeliverAreaByID(int stationID,int deliverAreaID);
	public List<DeliverArea> selecctDeliverAreaListByName(int stationID,String  deliverAreaName);
	
	public int insertUserModify(UserModify userModify);
	public int updateUserModify(UserModify userModify);
	public int deleteUserModify(int recordID);
	public List<UserModify> selectUserModifyList();
	public List<UserModify> selectUserModifyByType(int type);

	public int insertNewsOffice(NewsOffice newsOffice);
	public int updateNewsOffice(NewsOffice newsOffice);
	public int deleteNewsOffice(int newsOfficeID);
	public List<NewsOffice> selectNewsOfficeList();
	public List<NewsOffice> selectNewsOfficeByID(int noID);
	public List<NewsOffice> selectNewsOfficeByName(String noName);
}
