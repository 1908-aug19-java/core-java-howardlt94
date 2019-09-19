package com.revature.howard.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.servlets.DefaultServlet;



public class FrontController2 extends DefaultServlet {
	
	private static final long serialVersionUID = 1L;
	private RequestHelper rq = new RequestHelper();
	
	public FrontController2() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getMethod()+" to "+request.getRequestURI());
		String path = request.getRequestURI().substring(request.getContextPath().length());
		if(path.startsWith("/static/")) {
			super.doGet(request, response);	
		} else {
	
			rq.processGet(request, response);
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			rq.processPost(request, response);
	}
	
}
	