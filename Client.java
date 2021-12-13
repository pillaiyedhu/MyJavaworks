package com.main;

import java.util.Scanner;

import com.exception.InvalidInputException;
import com.exception.PoorPasswordException;
import com.provider.ObjectCreaator;
import com.services.UserServices;

public class Client {

	public static void main(String[] args) throws PoorPasswordException, InvalidInputException {
		UserServices user = ObjectCreaator.createObject();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your username :");
		String username = scn.next();
		
		System.out.println("Enter your password :");
		String password = scn.next();
		
		System.out.println("Enter your security question :");
		String secque = scn.next();
		
		try {
			user.SignUp(username, password, secque);
		}
		catch(PoorPasswordException p) {
			p.printStackTrace();	
		}
		catch(InvalidInputException i) {
			i.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter your username :");
		String username1 = scn.next();
		
		System.out.println("Enter your password :");
		String password2 = scn.next();
		
		if(user.SignIn(username1, password2)) {
			System.out.println("Welcome");
		}
		else {
			System.out.println("Wrong username or password");
			
		}

		
		
//		user.SignUp("java", "advancessssss", "birth date");
	
//		if(user.SignIn("java", "advancessssss")) {
//			System.out.println("Welcome");
//		}
//		else {
//			System.out.println("Wrong username or password");
//			
//		}
//		
//		
//		user.ForgetPassword("java","birth date");
//		
//		user.ChangePassword("java", "advancesssss", "core");
		
		
		

	}

}
