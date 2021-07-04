package com.hcl.resteasy.servicesImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.resteasy.dao.OrdersDAO;
import com.hcl.resteasy.model.Orders;
import com.hcl.resteasy.services.IOrderServices;

@Service
public class OrderServicesImpl implements IOrderServices{
	
	@Autowired
	OrdersDAO ordersDAO;
	
	

	@Override
	public List<Orders> displayOrders() {
		// TODO Auto-generated method stub
		return ordersDAO.findAll();
	}
	
	public Orders saveOrders(Orders orders) {
		return ordersDAO.saveAndFlush(orders);
	}


}
