package com.revature.projcetone.howard.dao;

import java.util.List;

import com.revature.projectone.howard.model.EmployeeInfo;

public interface EmployeeInfoDao {
	
	public List<EmployeeInfo> getEmployeeInfo();
	public EmployeeInfo getEmployeeInfoById(int id);
	public EmployeeInfo getEmployeeInfoByUsername(String u);
	public int createEmployeeInfo(EmployeeInfo e);
	public String updateEmployeeInfo(EmployeeInfo e);
	public int deleteEmployeeStuff(EmployeeInfo e);
}
