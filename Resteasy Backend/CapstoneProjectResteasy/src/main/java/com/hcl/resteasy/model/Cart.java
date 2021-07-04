package com.hcl.resteasy.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hcl.resteasy.dto.CustomerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cart_Id")
	private int cartID;
	@Column(name="quantity",nullable=false)
	private int quantity;
	
	@OneToMany
	private List<Menu> menu;
	
	@OneToMany
	private List<Orders> orders;
	 

}
