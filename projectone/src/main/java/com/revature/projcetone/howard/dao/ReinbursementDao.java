package com.revature.projcetone.howard.dao;

import java.util.List;

import com.revature.projectone.howard.model.Reinbursement;

public interface ReinbursementDao {
	
	public List<Reinbursement> getReinbursement();
	public Reinbursement getReinbursementById(int id);
	public int createReinbursement(Reinbursement r);
	public String updateReinbursement(Reinbursement r);
	public int deleteReinbursement(Reinbursement r);
	

}
