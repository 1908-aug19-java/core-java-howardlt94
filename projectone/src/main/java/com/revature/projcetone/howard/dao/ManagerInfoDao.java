package com.revature.projcetone.howard.dao;

import java.util.List;

import com.revature.projectone.howard.model.EmployeeInfo;
import com.revature.projectone.howard.model.ManagerInfo;

public interface ManagerInfoDao {
	
	public List<ManagerInfo> getManagerInfo();
	public ManagerInfo getManagerInfoById(int id);
	public int createManagerInfo(ManagerInfo e);
	public String updateManagerInfo(ManagerInfo e);
	public int deleteManagerInfo(ManagerInfo e);
	

}
