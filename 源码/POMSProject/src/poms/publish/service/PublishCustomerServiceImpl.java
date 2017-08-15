package poms.publish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poms.center.entity.Customer;
import poms.center.service.ICenterCustomerService;

@Service("publishCustomerService")
public class PublishCustomerServiceImpl implements IPublishCustomerService{

	@Autowired
	private ICenterCustomerService centerCustomerService;
	
	@Override
	public int customerRegister(Customer customer) {
		// TODO Auto-generated method stub
		return centerCustomerService.insertNewCustomer(customer);
	}

	@Override
	public List<Customer> selectCustomer(int stationID,int page) {
		// TODO Auto-generated method stub
		return centerCustomerService.selectCustomerList(stationID,page);
	}

}
