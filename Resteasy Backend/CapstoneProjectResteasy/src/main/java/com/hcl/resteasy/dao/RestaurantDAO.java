package com.hcl.resteasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.resteasy.model.Restaurants;

@Repository
public interface RestaurantDAO extends JpaRepository<Restaurants,Integer> {

}
