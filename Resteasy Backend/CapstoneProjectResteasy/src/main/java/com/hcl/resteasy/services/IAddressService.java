package com.hcl.resteasy.services;

import java.util.List;

import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Address;

public interface IAddressService {
	
	public String addAddress(Address address);
	public boolean deleteAddress(String houseno) throws FoodException;
	public String updateAddress(String houseNo,Address address) throws FoodException;
	public List<Address> displayAddress();

}
