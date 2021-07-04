package com.hcl.resteasy.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.resteasy.dao.RestaurantDAO;
import com.hcl.resteasy.model.Restaurants;
import com.hcl.resteasy.services.IRestaurantServices;
@Service
public class RestaurantServicesImpl implements IRestaurantServices {
	
	@Autowired
	RestaurantDAO restaurantDAO;

	@Override
	public List<Restaurants> displayRestaurant() {
		// TODO Auto-generated method stub
		return restaurantDAO.findAll();
	}

}
