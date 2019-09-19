package com.revature.projcetone.howard.impl;

import java.util.ArrayList;
import java.util.List;

import com.revature.projcetone.howard.dao.UserDao;
import com.revature.projectone.howard.model.User;

public class UserDaoImpl implements UserDao {
	
	private List<User> users = new ArrayList<>();
	
	public UserDaoImpl() {
		
		users.add(new User(1, "howardtran", "passwordd", "employee"));
		users.add(new User(2, "tiffanyu", "tiffpass", "employee"));
		users.add(new User(3, "fredglaze", "fredpass", "employee"));
		users.add(new User(4, "carolynadmin", "manpass", "manager"));
		
	}
	
	public List<User> getAll() {
		
		
		
		return new ArrayList<>(users);
	}
	
	public User getUserById(int id) {
		for(User u: users) {
			if(u.getId() == id) {
				return u;
			}
		}
		
		return null;
	}
	
	
	
	public User getUserByUsernameAndPassword(String username, String password) {
		
		for(User u: users) {
			if(u.getUsername() != null && u.getUsername().equals(username)) {
			if(u.getPassword() != null && u.getPassword().equals(password)) {
				return u; 	
			}
			
			
			}
		}
		return null;
	}
	
}



















