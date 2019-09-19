package com.revature.projectone.howard.services;

import java.util.List;

import com.revature.projcetone.howard.dao.ReinbursementDao;
import com.revature.projcetone.howard.impl.ReinbursementDaoImpl;
import com.revature.projectone.howard.model.Reinbursement;

public class ReinbursementService {

	ReinbursementDao reinburseDao = new ReinbursementDaoImpl();
	
	public List<Reinbursement> getAll(){
		return reinburseDao.getReinbursement();
	}
	
	public Reinbursement getReinbursementId(int id) {
		return reinburseDao.getReinbursementById(id);
	}
	
	public int create(Reinbursement r) {
		return reinburseDao.createReinbursement(r);
	}
	
	public String updateReinbursement(Reinbursement r) {
		return reinburseDao.updateReinbursement(r);
	}
}




