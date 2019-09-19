package com.revature.projectone.howard.delegates;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.projectone.howard.model.ManagerInfo;
import com.revature.projectone.howard.services.ManagerService;

public class ManagerInfoDelegate {
	
	private ManagerService ms = new ManagerService();
	
	public void getManagerInfos(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		List<ManagerInfo> managerinfos = ms.getAll();
		
		try(PrintWriter pw = response.getWriter()){
			pw.write(new ObjectMapper().writeValueAsString(managerinfos));
		}
	}

}
