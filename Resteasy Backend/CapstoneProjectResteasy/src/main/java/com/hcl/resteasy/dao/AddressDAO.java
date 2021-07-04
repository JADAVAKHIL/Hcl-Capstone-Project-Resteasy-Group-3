package com.hcl.resteasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.resteasy.model.Address;

@Repository
public interface AddressDAO extends JpaRepository<Address, Integer> {

	String findByHouseNo(String houseno);

	void deleteByHouseNo(String houseno);
	
	

}
