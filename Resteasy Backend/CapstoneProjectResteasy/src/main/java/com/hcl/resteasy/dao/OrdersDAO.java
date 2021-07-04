package com.hcl.resteasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.resteasy.model.Orders;

@Repository
public interface OrdersDAO extends JpaRepository<Orders,Integer>{

}
