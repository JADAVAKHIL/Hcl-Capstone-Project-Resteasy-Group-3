package com.hcl.resteasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.resteasy.model.Restaurants;
import com.hcl.resteasy.servicesImpl.RestaurantServicesImpl;




@CrossOrigin
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	RestaurantServicesImpl services;
    @GetMapping("/displayAll")
    @ResponseBody
    public List<Restaurants> displayAll() {
    	return services.displayRestaurant();
	}
    
}
