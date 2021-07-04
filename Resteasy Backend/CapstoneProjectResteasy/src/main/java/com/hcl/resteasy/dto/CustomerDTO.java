package com.hcl.resteasy.dto;

import lombok.Data;

@Data
public class CustomerDTO {
	
	private int customerID;
	private String customerName;
	private String email;
	private String phoneNo;
	private int addressID;
	private String street;
	private int pincode;
	private String stateName;
	private String countryName;


}
