package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Customer;
import poms.center.entity.DeliverAreaCustomer;
import poms.center.entity.Order;

public interface ICustomerDao {
	
	public int insertCustomer(Customer customer);
	
	public int updateCustomer(Customer customer);
	
	public int deleteCustomerByID(@Param("customerID")int customerID);
	
	public List<Customer> selectAllCustomer(@Param("stationID")int stationID);
	
	public List<DeliverAreaCustomer> selectDeliverAreaCustomer(@Param("stationID")int stationID);

	public List<Order> selectCustomerDebt(@Param("customerID")int customerID);
	public List<Customer> selectBigCustomer();
}
