package com.capgemini.login.service;

import com.capgemini.login.dao.UserDao;

public class LoginService implements LoginServiceInterface{
	UserDao obj = new UserDao();
	
	public String userLogin() {
		return obj.userLogin();
	}
}
