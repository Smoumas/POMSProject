package poms.finance.service;

import poms.center.entity.Employee;
import poms.center.entity.Operator;

import java.util.List;

/**
 * Created by sakamichi on 2017/8/7.
 */
public interface IStaffService {
    List<Employee> getAllEmployee(int stationID, int page);

    int updateEmployee(Employee employee);

    int newEmployee(Employee employee);

    int deleteEmployee(int employeeID);

    List<Employee> employeeList(int stationID, int page);

    List<Operator> getAllOperator(int stationID, int page);

    int updateLevel(int operatorID, int level);

    int setEmployeeDuty(int employeeID, int dutyType, int page);
}
