package com.validation;

public class InputValidation {
	public static boolean ValidUsername(String username) {
		if(username!=null&&username!=" ") {
			return true;	
		} else
			return false;
		
	}
	
	public static boolean ValidPassword(String password) {
		if(password!=null&&password.length()>=8) {
			return true;
			
		}else
			return false;
		
	}
	

}
