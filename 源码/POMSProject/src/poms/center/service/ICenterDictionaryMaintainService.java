package poms.center.service;

import java.util.List;

import poms.center.entity.DeliverArea;
import poms.center.entity.Department;
import poms.center.entity.Duty;
import poms.center.entity.NewsOffice;
import poms.center.entity.Station;
import poms.center.entity.TransferCom;
import poms.center.entity.UserModify;

public interface ICenterDictionaryMaintainService {
	
	public int insertDepartment(Department department);
	public int updateDepartment(Department department);
	public int deleteDepartment(int departmentID);
	public List<Department> selectDepartmentList(int stationID,int page);
	public List<Department> selectDepartmentByID(int stationID,int departmentID,int page);
	public List<Department> selectDepartmentListByName(int stationID,String departmentName,int page);
	
	public int insertDuty(Duty duty);
	public int updateDuty(Duty duty);
	public int deleteDuty(int dutyType);
	public List<Duty> selectDutyList(int departmentID,int page);
	public List<Duty> selectDutyByType(int dutyType,int page);
	public List<Duty> selectDutyByName(String dutyName,int page);
	
	public int insertTransferCom(TransferCom transferCom);
	public int updateTransferCom(TransferCom transferCom);
	public int deleteTransferCom(int transferComID);
	public List<TransferCom> selectTransferComList(int page);
	public List<TransferCom> selectTransferComByID(int transferComID);
	public List<TransferCom> selectTransferComByName(String transferComName,int page);
	
	public int insertDeliverArea(DeliverArea deliverArea);
	public int updateDeliverArea(DeliverArea deliverArea);
	public int deleteDeliverArea(int deliverAreaID);
	public List<DeliverArea> selectDeliverAreaList(int stationID,int page);
	public List<DeliverArea> selectDeliverAreaAllList(int page);
	public List<DeliverArea> selectDeliverAreaByID(int stationID,int deliverAreaID,int page);
	public List<DeliverArea> selecctDeliverAreaListByName(int stationID,String  deliverAreaName,int page);
	public List<DeliverArea> selecctDeliverAreaAllListByName(String  deliverAreaName,int page);
	
	public int insertUserModify(UserModify userModify);
	public int updateUserModify(UserModify userModify);
	public int deleteUserModify(int recordID);
	public List<UserModify> selectUserModifyList(int page);
	public List<UserModify> selectUserModifyByType(int type,int page);

	public int insertNewsOffice(NewsOffice newsOffice);
	public int updateNewsOffice(NewsOffice newsOffice);
	public int deleteNewsOffice(int newsOfficeID);
	public List<NewsOffice> selectNewsOfficeList(int page);
	public List<NewsOffice> selectNewsOfficeByID(int noID,int page);
	public List<NewsOffice> selectNewsOfficeByName(String noName,int page);
	
	public List<Station> stationList(int page);
}
