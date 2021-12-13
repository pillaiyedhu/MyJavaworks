package com.bean;

public class User {
	private String username;
	private String password;
	private String secque;
	
	public User(String username, String password, String secque ){
		this.username = username;
		this.password = password;
		this.secque = secque;	
	}

	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	
	public void setSecque(String secque) {
		this.secque = secque;
	}
	
	public String getSecque() {
		return secque;
	}
	
	
	public String toString() {
		return username;
		
	}
	
	
	

}
