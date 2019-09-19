package com.revature.projcetone.howard.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.revature.projcetone.howard.dao.ReinbursementDao;
import com.revature.projectone.howard.model.Reinbursement;
import com.revature.projectone.howard.model.Reinbursement;
import com.revature.projectone.howard.util.ConnectionUtil;

public class ReinbursementDaoImpl implements ReinbursementDao{
	
	public List<Reinbursement> getReinbursement() {
		System.out.println("made it to dao");
		String sql = "select * from reinbursement";
		List<Reinbursement> reinbursements = new ArrayList<Reinbursement>();
		//should i add in infered type?
		System.out.println("made it to dao");
		try( 
			Connection c = ConnectionUtil.getConnection();
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(sql);) {
			
			while(rs.next()) {
				int ReinbursementId = rs.getInt("reinburseId");
				String ReinbursementStatus = rs.getString("reinburseStatus");
				String ReinbursementAmount = rs.getString("reinburseAmount");
				int employeeId = rs.getInt("empId");
				int managerId =  rs.getInt("manId");
				Reinbursement r = new Reinbursement(ReinbursementId, ReinbursementStatus, ReinbursementAmount, employeeId, managerId );
				reinbursements.add(r);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reinbursements;
		
	}
	
	

	public Reinbursement getReinbursementById(int id) {
		String sql = "select * from reinbursement where reinbursestatus = ?";
		Reinbursement r = null;
		try(Connection c = ConnectionUtil.getConnection();
				PreparedStatement ps = c.prepareStatement(sql)) {
			
			ps.setInt(1, id);
			//String reinbursementstatus = " ";
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int ReinbursementId = rs.getInt("reinburseid");
				String ReinbursementStatus = rs.getString("reinbursestatus");
				String ReinbursementAmount = rs.getString("reinburseamount");
				int employeeId = rs.getInt("empId");
				int managerId =  rs.getInt("manId");
				r = new Reinbursement( ReinbursementId, ReinbursementStatus, ReinbursementAmount, employeeId, managerId);
			}
			
			rs.close();
			//ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return null;
		
	}

	public int createReinbursement(Reinbursement r) {
		int reinbursementCreated = 0;
		String sql = "insert into reinbursement ( reinburseid, reinbursestatus, reinburseamount, empid, manid)";
		try(Connection c = ConnectionUtil.getConnection();
				PreparedStatement ps = c.prepareStatement(sql)) {
			
			ps.setInt(1, r.getReinburseId());
			ps.setString(2, r.getReinburseStatus());
			ps.setString(3, r.getReinburseAmount());
			ps.setInt(4, r.getEmpId());
			ps.setInt(5, r.getManId());
			reinbursementCreated = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return reinbursementCreated;
	}

	public String updateReinbursement(Reinbursement r) {
		
		String reinbursementUpdated = " ";
		String sql = " update reinbursement "
				+ "set reinburseid = ?, "
				+ "set reinbursestatus = ?, "
				+ "set reinburseamount = ?, "
				+ "set empid = ?, "
				+ "set manid = ? ";
		
		try(Connection c = ConnectionUtil.getConnection();
				PreparedStatement ps = c.prepareStatement(sql)) {
			
			ps.setInt(1, r.getReinburseId());
			ps.setString(2, r.getReinburseStatus());
			ps.setString(3, r.getReinburseAmount());
			ps.setInt(4, r.getEmpId());
			ps.setInt(5, r.getManId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return reinbursementUpdated;
	}

	public int deleteReinbursement(Reinbursement r) {
		// TODO Auto-generated method stub
		return 0;
	}



	
	
	

}
