package com.services;

import com.exception.InvalidInputException;
import com.exception.PoorPasswordException;

public interface UserServices {
	void SignUp(String username, String password,String secque) throws PoorPasswordException,InvalidInputException;
	boolean SignIn(String username , String password)throws PoorPasswordException,InvalidInputException;
	String ForgetPassword(String username,String secque);
	String ChangePassword(String username,String oldPass,String newPass);

}
