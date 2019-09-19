package com.revature.projectone.howard.delegates;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.projectone.howard.model.EmployeeInfo;
import com.revature.projectone.howard.model.Reinbursement;
import com.revature.projectone.howard.services.ReinbursementService;

public class ReinbursementInfoDelegate {
	
	private ReinbursementService rs = new ReinbursementService();
	
	public void getReinbursements(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		List<Reinbursement> reinbursements = rs.getAll();
		
	
		
		
		try(PrintWriter pw = response.getWriter()){
			pw.write(new ObjectMapper().writeValueAsString(reinbursements));
	}

	}

	
	public void getReinbursementById(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		Reinbursement reinburseById = rs.getReinbursementId(15);
		System.out.println("in reinbursment delegate");
		try(PrintWriter pw = response.getWriter()){
			pw.write(new ObjectMapper().writeValueAsString(reinburseById));
	}
}
//	public void updateReinbursement(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	//	String something = request.getParameter("the thing you want")
				
	//	ReinsburtmentDao rb = new ReinBurtsmentDaoImpl();		
	}
	
//}