package com.hcl.resteasy.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.resteasy.model.Menu;


@Repository
public interface MenuDAO extends JpaRepository<Menu, Integer> {
	
	public List<Menu> findByItemName(String itemName);
	public boolean existsByRestaurants(String name);
	  public List<Menu> findByRestaurants(String name);
}
