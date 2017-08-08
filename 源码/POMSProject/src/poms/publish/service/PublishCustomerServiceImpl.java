package poms.publish.service;

import java.util.List;

import org.springframework.stereotype.Service;

import poms.center.entity.Customer;

@Service("publishCustomerService")
public class PublishCustomerServiceImpl implements IPublishCustomerService{

	@Override
	public int customerRegister(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> selectCustomer(int stationID) {
		// TODO Auto-generated method stub
		return null;
	}

}
