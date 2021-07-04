package com.hcl.resteasy.exceptions;

public class FoodException extends Exception {
 
	private static final long serialVersionUID = 1L;
	

	public FoodException(String exception) {
    	
    	getMessage(exception);
    }
	public String getMessage(String msg) {
		return msg;
	}
}
