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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.resteasy.dto.CustomerDTO;
import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Customer;
import com.hcl.resteasy.servicesImpl.CustomerServicesImpl;


@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired 
	CustomerServicesImpl customerServices;
	 
	 @GetMapping("/searchCustomer/{email}")
	 @ResponseBody
	 public ResponseEntity<Customer> search(@PathVariable("email") String email){
		 return new ResponseEntity<Customer>(customerServices.searchCustomer(email),HttpStatus.OK);
	 }
	 
	 @PostMapping("/registerCustomer")
	   
	    public ResponseEntity<Customer> add(@RequestBody Customer customer) throws FoodException  {
		 
		 String temp=customer.getEmail();
		 if(temp!=null && "".equals(temp)) {
			Customer userObj= customerServices.searchCustomer(temp);
			if(userObj !=null) {
				throw new FoodException("Email address already exists");
			}
		 }
	    	return new ResponseEntity<Customer>(customerServices.registerCustomer(customer),HttpStatus.OK);
	    }
	 
	 @DeleteMapping("/deleteaccount/{email}")
	 @ResponseBody  
	    public ResponseEntity<Boolean> deleteCustomer(@PathVariable String email)  {
	    	return new ResponseEntity<Boolean>(customerServices.deleteAccount(email),HttpStatus.OK);
	    }
	 
	 @PostMapping("/loginaccount")
	 @ResponseBody
	 public ResponseEntity<Customer> loginCustomer(@RequestBody Customer customer) throws FoodException{
		 String tempEmail=customer.getEmail();
		 String password=customer.getPassword();
		 
		 if(tempEmail != null && password !=null) {
			 return new ResponseEntity<Customer>(customerServices.getCustomer(tempEmail, password),HttpStatus.OK);
		 }
		 else {
			 throw new FoodException("Email-Id not not exist");
		 }
		 
		 
	 }
}
