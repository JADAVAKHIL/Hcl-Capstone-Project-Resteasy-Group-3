package com.hcl.resteasy.services;

import java.util.List;

import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Cart;

public interface ICartService {
	
	public Cart addToCart(Cart cart);
	public Cart updateCart(int cartID,Cart cart) throws FoodException;
	public List<Cart> displayCart();
	public boolean deleteFromCart(int id);
	

}
