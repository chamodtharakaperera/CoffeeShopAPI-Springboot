package com.pearson.coffee.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
	public ResourceNotFoundException(String message, Throwable throwable) {
		// TODO Auto-generated constructor stub
		super(message,throwable);
	}
}
