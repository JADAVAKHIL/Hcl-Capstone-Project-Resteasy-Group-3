package com.hcl.resteasy.services;

import java.util.List;

import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Orders;

public interface IOrderServices {
	
	public List<Orders> displayOrders();

	public Orders saveOrders(Orders orders);


	

}
