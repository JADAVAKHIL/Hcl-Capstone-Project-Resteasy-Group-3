package com.hcl.resteasy.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.resteasy.dao.CustomerDAO;
import com.hcl.resteasy.dto.CustomerDTO;
import com.hcl.resteasy.model.Customer;
import com.hcl.resteasy.services.ICustomerServices;

@Service

public class CustomerServicesImpl implements ICustomerServices {

	@Autowired
	CustomerDAO customerDAO;


	@Override
	public Customer registerCustomer(Customer customer) {
		return customerDAO.saveAndFlush(customer);
	}

	@Override
	public Customer getCustomer(String email,String password) {
		return customerDAO.findByEmailAndPassword(email, password);

	}

	@Override
	public boolean deleteAccount(String email) {
		// TODO Auto-generated method stub
		return customerDAO.deleteByEmail(email);
	}

	@Override
	public Customer searchCustomer(String email) {

		return customerDAO.findByEmail(email);

	}
}
