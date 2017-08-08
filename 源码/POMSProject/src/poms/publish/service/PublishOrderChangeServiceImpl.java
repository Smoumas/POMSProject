package poms.publish.service;

import org.springframework.stereotype.Service;

@Service("publishOrderChangeService")
public class PublishOrderChangeServiceImpl implements IPublishOrderChangeService{

	@Override
	public int cancelDeleteOrder(int orderID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cancelChangeAddress(int orderID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cancelPostpone(int orderID) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
