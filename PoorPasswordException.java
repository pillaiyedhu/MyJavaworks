package com.exception;

public class PoorPasswordException extends Exception{
	
	private String message;
	
	public PoorPasswordException(String message) {
		this.message=message;	
	}
	
	public String toString() {
		return message;
		
		
	}
	

}
