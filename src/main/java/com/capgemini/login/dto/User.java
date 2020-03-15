package com.capgemini.login.dto;

public class User {
	private String userName,userPassword;
	private int userId;
	public User(String userName, int userId,String userPassword) {
		this.userName=userName;
		this.userId=userId;
		this.userPassword=userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
