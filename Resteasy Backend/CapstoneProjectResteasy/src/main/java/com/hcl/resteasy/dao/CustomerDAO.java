package com.hcl.resteasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.resteasy.model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {
	
	public Customer findByEmail(String email);
	public Customer findByEmailAndPassword(String email,String Password);
	public boolean deleteByEmail(String email);

}
