package com.hcl.resteasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Orders;
import com.hcl.resteasy.services.IOrderServices;

@CrossOrigin
@RestController
@RequestMapping("/orders")
public class OrdersController {
	
	@Autowired
	private IOrderServices iOrderServices;
	
	
	@GetMapping("/list")
	public ResponseEntity<List<Orders>> displayOrders() {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<Orders>>(iOrderServices.displayOrders(),HttpStatus.OK);
	}
	@PostMapping("/save")
	public ResponseEntity<Orders> saveOrders(Orders orders) {
		return new ResponseEntity<Orders>(iOrderServices.saveOrders(orders),HttpStatus.OK);
		
	}
}
