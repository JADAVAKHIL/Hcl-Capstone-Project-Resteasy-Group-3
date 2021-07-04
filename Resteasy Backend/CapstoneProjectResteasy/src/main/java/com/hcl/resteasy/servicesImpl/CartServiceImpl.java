package com.hcl.resteasy.servicesImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.resteasy.dao.CartDAO;
import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Cart;
import com.hcl.resteasy.services.ICartService;

@Service
public class CartServiceImpl implements ICartService{

	@Autowired
	CartDAO cartDAO;


	public Cart addToCart(Cart cart) {
		return  cartDAO.saveAndFlush(cart);
	}


	@Override
	public Cart updateCart(int cartID, Cart cart) throws FoodException {
		// TODO Auto-generated method stub
		if(cartDAO.findById(cartID).isPresent()) {
			return cartDAO.saveAndFlush(cart);
		}
		else
			throw new FoodException("Invalid ID");
	}


	@Override
	public List<Cart> displayCart() {
		// TODO Auto-generated method stub
		return cartDAO.findAll();
	}


	@Override
	public boolean deleteFromCart(int id) {

		if(cartDAO.findById(id).isPresent()) {
			cartDAO.deleteById(id);
			return true;
		}
		return false;
	}

}
