package com.revature.projectone.howard.delegates;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.projcetone.howard.dao.UserDao;
import com.revature.projcetone.howard.impl.EmployeeInfoDaoImpl;
import com.revature.projcetone.howard.impl.UserDaoImpl;
import com.revature.projectone.howard.model.EmployeeInfo;
import com.revature.projectone.howard.model.User;
import com.revature.projectone.howard.services.EmployeeService;

public class AuthDelegate {

	private EmployeeService es = new EmployeeService();
	private UserDao userDao = new UserDaoImpl();
	//private EmployeeService ei = new 
	EmployeeInfoDaoImpl ed = new EmployeeInfoDaoImpl();
	
	public boolean isAuthorized(HttpServletRequest request) {

		String authToken = request.getHeader("Authorization");

		if (authToken != null) {
			String[] tokenArr = authToken.split(":");

			if (tokenArr.length == 2) {
				String idStr = tokenArr[0];
				String userRoleStr = tokenArr[1];

				if (idStr.matches("^\\d+$")) {

					User u = userDao.getUserById(Integer.parseInt(idStr));

					if (u != null && u.getUserRole().contentEquals(userRoleStr)) {
						return true;
					}
				}
			}
		}
		return false;
	}

//	}
	public void authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		EmployeeInfo user = es.getEmployeeInfoByUsername(username);
	//	EmployeeInfo employee = es.getById(14);
		//int id = user.getEmpId();
		
		
		//EmployeeInfo id = es.getEmployeeInfoByUsername(id);
		//EmployeeInfo user1 = es.getEmployeeInfoByUsername(empid);
		 User u = userDao.getUserByUsernameAndPassword(username, password);
		// Auth delegate shoudl call service method get employee by username > es should
		// call dao impl getemployeebyusername >
		// right hrere check employee username if! not null, check employee password
		if (user != null) {
			if (password.equals(user.getEmpPassword())) {
				 String token = u.getId()+":"+u.getUserRole();
				response.setStatus(200);
				System.out.println("they are equal");
				 response.setHeader("Authorization", token);
			} else {
				response.sendError(401);
				System.out.println("they arent equal");
			}
		}
	}
}
