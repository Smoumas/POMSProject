package poms.publish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Employee;
import poms.center.entity.Operator;
import poms.center.entity.Performance;
import poms.center.service.ICenterPersonManageService;

@Service("publishEmployeeManageService")
public class PublishEmployeeManageServiceImpl implements IPublishEmployeeManageService{

	@Autowired
	private ICenterPersonManageService centerPersonManageService;
	
	@Override
	public int newEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return centerPersonManageService.insertEmployee(employee);
	}

	@Override
	public int deleteEmployee(int employeeID) {
		// TODO Auto-generated method stub
		return centerPersonManageService.deleteEmployee(employeeID);
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return centerPersonManageService.updateEmployee(employee);
	}

	@Override
	public List<Employee> selectEmployeeList(int stationID) {
		// TODO Auto-generated method stub
		return centerPersonManageService.selectEmployeeList(stationID);
	}

	@Override
	public int setEmployeeDuty(int employeeID, int dutyType) {
		// TODO Auto-generated method stub
		Employee employee = centerPersonManageService.selectEmployeeByID(employeeID).get(0);
		employee.setDutyID(dutyType);
		return centerPersonManageService.updateEmployee(employee);
	}

	@Override
	public int setOperatorLevel(Operator operator, int level) {
		// TODO Auto-generated method stub
		operator.setLevel(level);
		return centerPersonManageService.updateOperator(operator);
	}

	@Override
	public List<Performance> selectSalerPerformance(int stationID) {
		// TODO Auto-generated method stub
		return centerPersonManageService.selectSalerPerformance(stationID);
	}

	@Override
	public List<Performance> selectDeliverPerformance(int stationID) {
		// TODO Auto-generated method stub
		return centerPersonManageService.selectDeliverPerformance(stationID);
	}
	
}
