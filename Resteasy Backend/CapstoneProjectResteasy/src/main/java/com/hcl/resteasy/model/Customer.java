package com.hcl.resteasy.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customer_id")
	private int customerID;
	@Column(name="first_name",nullable=false)
	private String firstName;
	@Column(name="email",nullable=false, unique=true)
	private String email;
	@Column(name="lastName",nullable=false, unique=true)
	private String lastName;
	@Column(name="password",nullable=false)
	private String password;

	@OneToOne
	private Cart cart;
	
	@OneToMany
	private List<Address> address;
}
