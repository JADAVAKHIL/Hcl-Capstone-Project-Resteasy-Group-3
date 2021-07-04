package com.hcl.resteasy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Menu;
import com.hcl.resteasy.servicesImpl.MenuServicesImpl;


@CrossOrigin
@RestController
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	MenuServicesImpl menuServices;
	
	@GetMapping("/searchitem/{itemName}")
	public ResponseEntity<List<Menu>> searchItem(@PathVariable("itemName") String itemName) throws FoodException {
		return new ResponseEntity<List<Menu>>(menuServices.searchItem(itemName),HttpStatus.OK);
	}
	
	@GetMapping("/getByRestaurantName/{name}")
	public ResponseEntity<List<Menu>> getByRestuarantName(@PathVariable("name") String name){
		
		return new ResponseEntity<List<Menu>>(menuServices.getItemsByRestaurant(name),HttpStatus.OK);
	}
	
	@GetMapping("/display")
	public ResponseEntity<List<Menu>> getAllItems(){
		return new ResponseEntity<List<Menu>>(menuServices.displayMenu(),HttpStatus.OK);
	}
	

}
