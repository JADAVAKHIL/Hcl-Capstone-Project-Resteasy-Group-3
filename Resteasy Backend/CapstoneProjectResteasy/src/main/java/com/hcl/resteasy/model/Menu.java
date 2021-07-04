package com.hcl.resteasy.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.hcl.resteasy.dto.CustomerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="menu")

public class Menu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="food_id")
	private int itemID;
	@Column(name="item_name",nullable=false)
	private String itemName;
	@Column(name="category",nullable=false)
	private String itemtype;
	@Column(name="image", nullable=false)
	private String photo;
	@Column(name="price",nullable=false)
	private double price;
	
	@ManyToOne
	private Restaurants restaurants;
	
	@ManyToOne
	private Cart cart;

}
