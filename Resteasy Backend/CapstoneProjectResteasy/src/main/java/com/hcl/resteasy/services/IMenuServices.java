package com.hcl.resteasy.services;

import java.util.List;

import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Menu;

public interface IMenuServices {
	
	public List<Menu> displayMenu();
	public List<Menu> searchItem(String item) throws FoodException;
	public List<Menu> getItemsByRestaurant(String name );
	
}
