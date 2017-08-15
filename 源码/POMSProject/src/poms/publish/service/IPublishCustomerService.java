package poms.publish.service;

import java.util.List;

import poms.center.entity.Customer;

public interface IPublishCustomerService {
	public int customerRegister(Customer customer);
	public List<Customer> selectCustomer(int stationID,int page);
}
