package poms.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.constants.CommonConstants;
import poms.center.dao.IEmployeeDao;
import poms.center.dao.IOperatorDao;
import poms.center.entity.Employee;
import poms.center.entity.Operator;
import poms.center.entity.Performance;

@Service("centerPersonManageService")
public class CenterPersonManageServiceImpl implements ICenterPersonManageService{

	@Autowired
	private IEmployeeDao employeeDao;

	@Autowired
	private IOperatorDao operatorDao;

	@Override
	public int insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.insertEmployee(employee);
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public int deleteEmployee(int employeeID) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployee(employeeID);
	}

	@Override
	public List<Employee> selectEmployeeList(int stationID,int page) {
		// TODO Auto-generated method stub
		return employeeDao.selectEmployeeList(stationID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<Employee> selectEmployeeByID(int employeeID,int page) {
		// TODO Auto-generated method stub
		return employeeDao.selectEmployeeByID(employeeID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<Employee> selectEmployeeByName(int stationID, String name,int page) {
		// TODO Auto-generated method stub
		return employeeDao.selectEmployeeByName(stationID, name,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<Performance> selectDeliverPerformance(int stationID,int page) {
		// TODO Auto-generated method stub
		return employeeDao.selectDeliverPerformance(stationID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<Performance> selectSalerPerformance(int stationID,int page) {
		// TODO Auto-generated method stub
		return employeeDao.selectSalerPerformance(stationID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public int insertOperator(Operator operator) {
		// TODO Auto-generated method stub
		return operatorDao.insertOperator(operator);
	}

	@Override
	public int updateOperator(Operator operator) {
		// TODO Auto-generated method stub
		return operatorDao.updateOperator(operator);
	}

	@Override
	public int deleteOperator(int operatorID) {
		// TODO Auto-generated method stub
		return operatorDao.deleteOperator(operatorID);
	}

	@Override
	public List<Operator> selectOperatorList(int stationID,int page) {
		// TODO Auto-generated method stub
		return operatorDao.selectOperatorList(stationID,page*CommonConstants.PAGE_SIZE);
	}

	@Override
	public List<Operator> selectOperatorByID(int operatorID) {
		// TODO Auto-generated method stub
		return operatorDao.selectOperatorByID(operatorID);
	}

	@Override
	public int login(Operator operator) {
		// TODO Auto-generated method stub
		List<Operator> operatorList = operatorDao.selectOperatorByID(operator.getOperatorID());
		if(operatorList.size() == 0){
			return 0;
		}
		Operator resultOperator = operatorDao.selectOperatorByID(operator.getOperatorID()).get(0);
		if((!resultOperator.getPassword().equals(operator.getPassword()))){
			return 0;	
		}
		return resultOperator.getLevel();
	}
	
}
