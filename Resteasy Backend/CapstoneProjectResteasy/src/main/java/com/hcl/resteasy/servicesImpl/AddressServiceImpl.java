package com.hcl.resteasy.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.resteasy.dao.AddressDAO;
import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Address;
import com.hcl.resteasy.services.IAddressService;
@Service
public class AddressServiceImpl implements IAddressService {

	@Autowired
	AddressDAO dao;

	@Override
	public String addAddress(Address address) {
		dao.saveAndFlush(address);
		return "Address added Successfully";
	}

	@Override
	public boolean deleteAddress(String houseno) throws FoodException {
		if(!dao.findByHouseNo(houseno).isEmpty()) {
			dao.deleteByHouseNo(houseno);
			return true;
		}else
			throw new FoodException("Address already deleted");
	}

	@Override
	public String updateAddress(String houseNo,Address address) throws FoodException {

		if(!dao.findByHouseNo(houseNo).isEmpty()) {
			address.setHouseNo(houseNo);
			dao.saveAndFlush(address);
			return "Address Updated Successfully";
		}else
			throw new FoodException("No Address is found");
	}

	@Override
	public List<Address> displayAddress() {
		return dao.findAll();
	}

}
