package com.revature.projectone.howard.services;

import java.util.List;

import com.revature.projcetone.howard.dao.ManagerInfoDao;
import com.revature.projcetone.howard.impl.ManagerInfoDaoImpl;
import com.revature.projectone.howard.model.ManagerInfo;

public class ManagerService {
	
	ManagerInfoDao manInfoDao = new ManagerInfoDaoImpl();
	
	public List<ManagerInfo> getAll(){
		return manInfoDao.getManagerInfo();
	}
	
	public ManagerInfo getById(int manId) {
		return manInfoDao.getManagerInfoById(manId);
		
	}
	
	public int create(ManagerInfo m) {
		return manInfoDao.createManagerInfo(m);
	}

}
