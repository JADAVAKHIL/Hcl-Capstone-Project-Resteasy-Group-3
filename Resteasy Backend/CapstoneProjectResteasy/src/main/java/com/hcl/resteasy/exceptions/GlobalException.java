package com.hcl.resteasy.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	public ResponseEntity<Object> globalExceptionHandler(HttpServletRequest req,Exception e){
		return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
	}

}
