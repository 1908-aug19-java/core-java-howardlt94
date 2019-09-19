package com.revature.projcetone.howard.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.projcetone.howard.dao.ManagerInfoDao;
import com.revature.projectone.howard.model.ManagerInfo;
import com.revature.projectone.howard.util.ConnectionUtil;

public class ManagerInfoDaoImpl implements ManagerInfoDao {

	public List<ManagerInfo> getManagerInfo() {
		
		String sql = "select * from managerinfo";
		 List<ManagerInfo> managerInfos = new ArrayList<ManagerInfo>();
		
		 try(
				 Connection c = ConnectionUtil.getConnection();
				 Statement s = c.createStatement();
				 ResultSet rs = s.executeQuery(sql);){
			 
			 while(rs.next()) {
				 int managerId = rs.getInt("manid");
				 String managerLogin = rs.getString("manlogin");
				 String managerName = rs.getString("manname");
				 String managerLastName = rs.getString("manlastname");
				 String managerPassword = rs.getString("manpassword");
				 ManagerInfo m = new ManagerInfo(managerId, managerLogin, managerName , managerLastName, managerPassword);
				 managerInfos.add(m);
			 }
					 
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return managerInfos;
	}

	public ManagerInfo getManagerInfoById(int id) {
		String sql = "select * from managerinfo where manid=? ";
		ManagerInfo m = null;
		try(Connection c = ConnectionUtil.getConnection();
				PreparedStatement ps = c.prepareStatement(sql)) {
			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int managerId = rs.getInt("manid");
				 String managerLogin = rs.getString("manlogin");
				 String managerName = rs.getString("manname");
				 String managerLastName = rs.getString("manlastname");
				 String managerPassword = rs.getString("manpassword");
				  m = new ManagerInfo(managerId, managerLogin, managerName , managerLastName, managerPassword);
				
			}
			
			rs.close();
			//ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	public int createManagerInfo(ManagerInfo m) {
		int managerInfoCreated = 0;
		String sql = "insert into managerinfo (manid, manlogin, manname , manlastname, manpassword) values (?,?,?,?,?)";
		try(Connection c = ConnectionUtil.getConnection();
				PreparedStatement ps = c.prepareStatement(sql)) {
			
			ps.setInt(1, m.getManId());
			ps.setString(2, m.getManName());
			ps.setString(3, m.getManLastname());
			ps.setString(4, m.getManLogin());
			ps.setString(5, m.getManPassword());
			managerInfoCreated = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return managerInfoCreated;
	}

	public String updateManagerInfo(ManagerInfo m) {
		
	String managerInfoUpdated = " ";
	String sql = "update userinfo "
			+ "set manid = ?, "
			+ " manlogin = ?, "
			+ " maname = ?, "
			+ "manlastname = ?, "
			+ "manpassword = ? ";
	try(Connection c = ConnectionUtil.getConnection();
			PreparedStatement ps = c.prepareStatement(sql)){
		ps.setInt(1, m.getManId());
		ps.setString(2, m.getManLogin());
		ps.setString(3, m.getManName());
		ps.setString(4, m.getManLastname());
		ps.setString(5, m.getManPassword());
		
		ps.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		// TODO Auto-generated method stub
		return managerInfoUpdated;
	}

	public int deleteManagerInfo(ManagerInfo m) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
