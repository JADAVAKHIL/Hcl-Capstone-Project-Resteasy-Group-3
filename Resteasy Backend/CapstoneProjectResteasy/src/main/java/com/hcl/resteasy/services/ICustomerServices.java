package com.hcl.resteasy.services;

import java.util.List;

import com.hcl.resteasy.dto.CustomerDTO;
import com.hcl.resteasy.model.Customer;

public interface ICustomerServices {
	
	public Customer registerCustomer(Customer customer);
	public Customer getCustomer(String email,String password);
	public boolean deleteAccount(String email);
	public Customer searchCustomer(String email);

}
