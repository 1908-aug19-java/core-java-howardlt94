package com.revature.howard.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.projectone.howard.delegates.AuthDelegate;
import com.revature.projectone.howard.delegates.EmployeeInfoDelegate;
import com.revature.projectone.howard.delegates.ManagerInfoDelegate;
import com.revature.projectone.howard.delegates.ReinbursementInfoDelegate;
import com.revature.projectone.howard.delegates.UserDelegate;
import com.revature.projectone.howard.delegates.ViewDelegate;

public class RequestHelper  {
	
	private EmployeeInfoDelegate ed = new EmployeeInfoDelegate();
	private ManagerInfoDelegate md = new ManagerInfoDelegate();
	private ReinbursementInfoDelegate rd = new ReinbursementInfoDelegate();
	private ViewDelegate vd = new ViewDelegate();
	private UserDelegate ud = new UserDelegate();
	private AuthDelegate ad = new AuthDelegate();
	
	public void processGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String uri = request.getServletPath();
		if(uri.startsWith("/api/")) {
			
			String record = uri.substring(5);
			switch(record ) {
			case "employee":
				System.out.println("here");
				ed.getEmployeeInfo(request, response);
				break;
				
			case "manager":
				md.getManagerInfos(request, response);
				break;
				//http://localhost:8081/projectone/api/reinbursement
			case "reinbursement":
				rd.getReinbursements(request, response);
				break;
			
			case "specificemployee":
				ed.getEmployeeInfoById(request, response);
				break;
			
			case "soloreinbursement":
				rd.getReinbursements(request, response);
				break;
			
			case "updateemployee":
				ed.getEmployeeInfo(request, response);
				break;
				
			case "updatereinburse":
				rd.getReinbursements(request, response);
				break;
				
			default :
			
				response.sendError(404, "record is not in the system");
				
			}
		} else {
			vd.returnView(request, response);
		}
		
	}
	
	public void processPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String path = request.getServletPath();
		switch(path) {
		case "/login":
			ad.authenticate(request, response);
			break;
			
		default:
			response.sendError(405);
		}
	}

}
