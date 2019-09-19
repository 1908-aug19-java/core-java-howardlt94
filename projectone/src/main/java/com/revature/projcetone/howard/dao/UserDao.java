package com.revature.projcetone.howard.dao;

import java.util.List;

import com.revature.projectone.howard.model.User;

public interface UserDao { 
	
	public List<User> getAll();
	public User getUserById(int id);
	public User getUserByUsernameAndPassword(String username, String password);

}
