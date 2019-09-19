package com.revature.projectone.howard.delegates;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.projectone.howard.model.EmployeeInfo;
import com.revature.projectone.howard.services.EmployeeService;

public class EmployeeInfoDelegate {
	
	private EmployeeService es = new EmployeeService();
	
	
	public void getEmployeeInfo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		List<EmployeeInfo> employeeinfos = es.getAll();
		
		

			try(PrintWriter pw = response.getWriter()){
			pw.write(new ObjectMapper().writeValueAsString(employeeinfos));
		}
	

}
	public void getEmployeeInfoById(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		EmployeeInfo employeeids = es.getById(15);
		
		try(PrintWriter pw = response.getWriter()){
			pw.write(new ObjectMapper().writeValueAsString(employeeids));
	}
	}
}
