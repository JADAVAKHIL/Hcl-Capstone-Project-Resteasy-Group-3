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
@Table(name="restaurants")
public class Restaurants {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int restaurantID;
	@Column(name="rest_name", nullable=false)
	private String name;
	@Column(name="location",nullable=false)
	private String location;
	@Column(name = "rating",nullable=false)
	private float rating;
	@Column(name="rest_type",nullable=false)
	private String type;
	
	
	@OneToMany
	private List<Menu> menu;
	

}
