package com.serviceconnection;

import com.bean.User;
import com.exception.InvalidInputException;
import com.exception.PoorPasswordException;
import com.services.UserServices;
import com.validation.InputValidation;

public class UserServicesImp implements UserServices {
	
	User u;
	
	public  void SignUp(String username, String password, String secque) throws PoorPasswordException,InvalidInputException {
		if(InputValidation.ValidUsername(username)) 
		{
			if(InputValidation.ValidPassword(password))
			{
				u=new User(username,password,secque);
			}
			else {
				throw new PoorPasswordException("Please enter a strong password ");
			}
		}
		else {
			throw new InvalidInputException("Please enter a valid Username");
//			System.out.println("Poor Password ......");
			
		}
		
		
		
	
	}

	public boolean SignIn(String username, String password) throws InvalidInputException,PoorPasswordException {
		if(InputValidation.ValidUsername(username)) 
		{
			if(InputValidation.ValidPassword(password))
			{
				if(u.getUsername().equals(username) && u.getPassword().equals(password))
					return true;
				
			}	
			else {
				throw new PoorPasswordException("Wrong password");
			} 	
		}
		else {
			
			throw new InvalidInputException("Username invalid");
//			System.out.println("Poor Password ......");
		
		}
		return false;
	}

	
	public String ForgetPassword(String username, String secque) {
		
		
		if(u.getUsername().equals(username)&&u.getSecque().equals(secque)) {
			System.out.println("Default Password is  : java ");
		}
		return null;
	}

	
	public String ChangePassword(String username, String oldPass, String newPass) {
			System.out.println("Your new password is : "+newPass);
			
		return null;
	}
	
	

}
