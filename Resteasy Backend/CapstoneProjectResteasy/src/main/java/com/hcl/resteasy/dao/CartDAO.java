package com.hcl.resteasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.resteasy.model.Cart;

@Repository
public interface CartDAO extends JpaRepository<Cart, Integer> {

}
