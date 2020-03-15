package com.capgemini.login.dao;

import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.login.dto.User;
import com.capgemini.login.exceptions.MyExceptions;
import com.capgemini.login.util.UserRepository;
public class UserDao implements UserDaoInterface{
public UserDao() {
	new UserRepository();
}
HashMap<Integer,User> daoHashMap=  UserRepository.getMapRepo();
Scanner input=new Scanner(System.in);

public String userLogin() {
	System.out.println("Enter username");
	int x=input.nextInt();
	System.out.println("Enter password");
	String password=input.next();
	try {
		for(Integer i : daoHashMap.keySet()) {
			if(i==x) {
				if(daoHashMap.get(i).getUserPassword().equals(password)) {
					System.out.println("You are successfully Logged In");
					return "Success";
				}
				else {
					throw new MyExceptions("Incorrect Password");
				}
					
			} 
			
		}
		throw new MyExceptions("Incorrect UserName");
	} catch (MyExceptions exp) {
		System.out.println(exp);
		return userLogin();
	}
}
}
