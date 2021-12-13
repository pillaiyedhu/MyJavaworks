package com.exception;

public class InvalidInputException extends Exception{
	
	private String message;
	
	public InvalidInputException(String message) {
		this.message=message;
		
	}
	
	public String toString() {
		return message;
		
		
	}

}
