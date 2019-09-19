package com.revature.projectone.howard.delegates;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewDelegate {

	public void returnView(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String uri = request.getServletPath();
		
		// change swith statement
		
		switch(uri) {
		case "/employee": 
			request.getRequestDispatcher("/static/Views/EmployeeDirectory.html").forward(request, response);
			break;
		
		case "/manager":
			request.getRequestDispatcher("/static/Views/ManagerHomePage.html").forward(request,  response);
			break;
			
		case "/reinbursement":
			request.getRequestDispatcher("/static/Views/ReinbursementPage.html").forward(request, response);
			break;
			
		case "/updateemployee": 
			request.getRequestDispatcher("/static/Views/UpdateEmployeePage.html").forward(request, response);
			break;
			
		case "/updatereinbursement":
			request.getRequestDispatcher("/static/Views/UpdateReinbursementPage.html").forward(request, response);
			break;
			
		case "/elogout":
			request.getRequestDispatcher("/static/Views/LogoutEmployee.html").forward(request, response);
			break;
			
		case "/mlogout":
			request.getRequestDispatcher("/static/Views/LogoutManager.html").forward(request, response);
			break;
			
		case "/specificemployee":
			request.getRequestDispatcher("/static/Views/SpecficEmployeeInfo.html").forward(request, response);
			break;
			
		case "/soloreinbursement":
			request.getRequestDispatcher("/static/Views/ReinbursementByEmployee.html").forward(request, response);
			break;
		
			case "/login":
				request.getRequestDispatcher("/static/Views/Login.html").forward(request, response);
				break;
			
			case "/home":
				request.getRequestDispatcher("/static/Views/EmployeeHomePage.html").forward(request, response);
				break;
			
				
			default:
				response.sendError(404, "static resource not found");
			}
			
			}
		
		
		}
		
	

	 





