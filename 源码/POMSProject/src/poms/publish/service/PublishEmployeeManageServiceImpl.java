package poms.publish.service;

import java.util.List;

import org.springframework.stereotype.Service;

import poms.center.entity.Employee;
import poms.center.entity.Performance;

@Service("publishEmployeeManageService")
public class PublishEmployeeManageServiceImpl implements IPublishEmployeeManageService{

	@Override
	public int newEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee(int employeeID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> selectEmployee(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setEmployeeDuty(int employeeID, int dutyType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setOperatorLevel(int operatorID, int level) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Performance> selectSalerPerformance(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Performance> selectDeliverPerformance(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
