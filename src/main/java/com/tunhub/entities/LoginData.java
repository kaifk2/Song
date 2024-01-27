package com.tunhub.entities;


public class LoginData {

	
	String email;
	String password;
	
	
	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LoginData(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "LoginData [email=" + email + ", password=" + password + "]";
	}
	
	
	
}
