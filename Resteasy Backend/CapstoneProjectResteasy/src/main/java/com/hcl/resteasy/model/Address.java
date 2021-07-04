package com.hcl.resteasy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.hcl.resteasy.dto.CustomerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_id")
	private int addressID;
	@Column(name="house_no",nullable=false, unique=true)
	private String houseNo;
	@Column(name="street_name",nullable=false)
	private String street;
	@Column(name="pincode",nullable=false)
	private int pincode;
	@Column(name="state_name", nullable=false)
	private String state;
	@Column(name="country_name", nullable=false)
	private String country;
	
	
}
