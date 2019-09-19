package com.revature.projectone.howard.services;

import java.util.List;

import com.revature.projcetone.howard.dao.EmployeeInfoDao;
import com.revature.projcetone.howard.impl.EmployeeInfoDaoImpl;
import com.revature.projectone.howard.model.EmployeeInfo;

public class EmployeeService {
	
	EmployeeInfoDao  empInfoDao = new EmployeeInfoDaoImpl();
	
	public List<EmployeeInfo> getAll(){
		//System.out.println("emplyee service getall method");
	
		return empInfoDao.getEmployeeInfo();
		//return null;
	}
	
	public EmployeeInfo getById(int empId) {
		return empInfoDao.getEmployeeInfoById(empId);
	}
	
	public int create(EmployeeInfo em) {
		return empInfoDao.createEmployeeInfo(em);
	}
	
	public EmployeeInfo getEmployeeInfoByUsername(String u) {
	return empInfoDao.getEmployeeInfoByUsername(u);
}
}
