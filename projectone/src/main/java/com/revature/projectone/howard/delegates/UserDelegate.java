package com.revature.projectone.howard.delegates;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.projcetone.howard.dao.UserDao;
import com.revature.projcetone.howard.impl.UserDaoImpl;
import com.revature.projectone.howard.model.User;

public class UserDelegate {

	
	private UserDao userDao = new UserDaoImpl();
	
	public void getUsers(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String idStr = request.getParameter("id");
		if(idStr == null) {
			List<User> users = userDao.getAll();
			try(PrintWriter pw = response.getWriter();) {
				pw.write(new ObjectMapper().writeValueAsString(users));
			}
		} else {
			
			if(idStr.matches("^\\d+$")) {
				
				User u = userDao.getUserById(Integer.parseInt(idStr));
				if(u==null) {
					response.sendError(404,"No user with this ID");
				
				} else {
					try(PrintWriter pw = response.getWriter()) {
						pw.write(new ObjectMapper().writeValueAsString(u));
					}
				}
			} else {
				response.sendError(400, "Invalid ID parameter");
			}
		}
	}
}
