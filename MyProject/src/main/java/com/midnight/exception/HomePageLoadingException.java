package com.midnight.exception;

public class HomePageLoadingException extends RuntimeException{
	
	private static final long serialVersionUID = 2363272450961992938L;

	public HomePageLoadingException(String message) {
		super(message);
	}
	
}
