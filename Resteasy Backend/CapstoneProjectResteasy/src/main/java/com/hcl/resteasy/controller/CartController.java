package com.hcl.resteasy.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.resteasy.exceptions.FoodException;
import com.hcl.resteasy.model.Cart;
import com.hcl.resteasy.servicesImpl.CartServiceImpl;


@CrossOrigin
@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartServiceImpl service;
	
	@PostMapping("/add")
	public ResponseEntity<Cart> addToCart(@RequestBody Cart cart){
		return new ResponseEntity<Cart>(service.addToCart(cart),HttpStatus.OK);
	}
	@PutMapping("/update/{cartId}")
	public ResponseEntity<Cart> updateCart(@PathVariable int cartId,@RequestBody Cart cart) throws FoodException{
		return new ResponseEntity<Cart>(service.updateCart(cartId, cart),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{cartId}")
	public ResponseEntity<Boolean> deleteFromCart(@PathVariable int cartId) throws FoodException{
		return new ResponseEntity<Boolean>(service.deleteFromCart(cartId),HttpStatus.OK);
	}
	@GetMapping("/display")
	public ResponseEntity<List<Cart>> displayCart(){
		return new ResponseEntity<List<Cart>>(service.displayCart(),HttpStatus.OK);
	}


}
