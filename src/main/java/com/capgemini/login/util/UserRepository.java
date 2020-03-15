package com.capgemini.login.util;

import java.util.HashMap;

import com.capgemini.login.dto.User;

public class UserRepository {
	public static HashMap<Integer, User> mapRepo = new HashMap<Integer,User>();
	public UserRepository() {
		mapRepo.put(11615915,new User("shahil",11615915,"Abc-1234"));
		mapRepo.put( 11605004,new User("harish",11605004,"Abc-1235"));
		mapRepo.put( 11604993,new User("satish",11604993,"Abc-1236"));
	}
	public static HashMap<Integer, User> getMapRepo() {
		return mapRepo;
	}
	public static void setMapRepo(HashMap<Integer, User> mapRepo) {
		UserRepository.mapRepo = mapRepo;
	}
	
	
	
	
	
}
