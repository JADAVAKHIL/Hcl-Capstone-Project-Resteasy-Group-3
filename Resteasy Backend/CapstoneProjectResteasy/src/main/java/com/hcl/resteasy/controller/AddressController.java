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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Address;
import com.hcl.resteasy.servicesImpl.AddressServiceImpl;


@CrossOrigin
@RestController
@RequestMapping("/address")
public class AddressController {
	
	
	@Autowired
	AddressServiceImpl service;
    
	@PostMapping("/add")
	public ResponseEntity<String> addAddress(@RequestBody Address address) {
		return new ResponseEntity<String>(service.addAddress(address),HttpStatus.OK);
	}
	@PutMapping("/update/{houseNo}")
	public ResponseEntity<String> updateAddress(@PathVariable String houseNo, @RequestBody Address address) throws FoodException{
		return new ResponseEntity<String>(service.updateAddress(houseNo,address),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{String houseNo}")
	public ResponseEntity<Boolean> deleteAddress(String houseNo) throws FoodException{
		return new ResponseEntity<Boolean>(service.deleteAddress(houseNo),HttpStatus.OK);
	}
	@GetMapping("/display")
	public ResponseEntity<List<Address>> displayAddress(){
		return new ResponseEntity<List<Address>>(service.displayAddress(),HttpStatus.OK);
	}


}
