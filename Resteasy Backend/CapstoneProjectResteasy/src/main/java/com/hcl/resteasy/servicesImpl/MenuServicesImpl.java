package com.hcl.resteasy.servicesImpl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.resteasy.dao.MenuDAO;
import com.hcl.resteasy.dao.RestaurantDAO;
import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Menu;
import com.hcl.resteasy.services.IMenuServices;

@Service
public class MenuServicesImpl implements IMenuServices {
	
	@Autowired
	MenuDAO menuDAO;
	
	
	Menu menu= new Menu();
	
	@Autowired
	RestaurantDAO restaurantDAO;

	

	@Override
	public List<Menu> displayMenu() {
		
		return menuDAO.findAll();
	}
	
		@Override
	public List<Menu> searchItem(String item) throws FoodException {
		// TODO Auto-generated method stub
		List<Menu> itemList=new ArrayList<Menu>();
	     itemList=menuDAO.findByItemName(item);
	     if(itemList.isEmpty()==false) {
	    	 return itemList;
	     }
	     else
	    	 throw new FoodException("Sorry Item Does Not Exists...");
	}

		@Override
		public List<Menu> getItemsByRestaurant(String name) {
			
			return menuDAO.findByRestaurants(name);
			
		}

	
}
