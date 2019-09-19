package com.revature.projcetone.howard.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.projcetone.howard.dao.EmployeeInfoDao;
import com.revature.projectone.howard.model.EmployeeInfo;
import com.revature.projectone.howard.util.ConnectionUtil;

public class EmployeeInfoDaoImpl implements EmployeeInfoDao {

	
	public List<EmployeeInfo> getEmployeeInfo() {
		//System.out.println("Employeedaoimpl getemployeeinfo");
		String sql = "select * from employeeinfo";
		List<EmployeeInfo> employeeInfos = new ArrayList<EmployeeInfo>();
		
	try (
			Connection c = ConnectionUtil.getConnection();
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(sql);){
		
		while(rs.next()) {
			//	Department d = new Department();
				int employeeId = rs.getInt("empid");
				String employeeLogin = rs.getString("emplogin");
				String employeeName = rs.getString("empname");
				String empLastName = rs.getString("emplastname");
				String employeePassword = rs.getString("emppassword");
				EmployeeInfo em = new EmployeeInfo(employeeId, employeeLogin, employeeName, empLastName,employeePassword );
				employeeInfos.add(em);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return employeeInfos;
		
		
	}

	public EmployeeInfo getEmployeeInfoById(int id) {
		System.out.println("Employeedaoimpl getemployeeinfobyinfo");
		String sql = "select * from employeeinfo where empid = ?";
		EmployeeInfo em = null;
		try(Connection c = ConnectionUtil.getConnection();
				PreparedStatement ps = c.prepareStatement(sql)){
			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int employeeId = rs.getInt("empid");
				String employeeLogin = rs.getString("emplogin");
				String employeeName = rs.getString("empname");
				String empLastName = rs.getString("emplastname");
				String employeePassword = rs.getString("empassword");
				 em = new EmployeeInfo(employeeId, employeeLogin, employeeName, empLastName,employeePassword );
				
			}
			
			rs.close();
			//ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return em;
	}

	public int createEmployeeInfo(EmployeeInfo em) {
		int employeeInfoCreated = 0;
		String sql = "insert into employeeinfo (empid, emplogin, empname, emplastname, empassword) values (?,?,?,?,?)";
		try(Connection c = ConnectionUtil.getConnection();
				PreparedStatement ps = c.prepareStatement(sql)){
			
			ps.setInt(1,  em.getEmpId());
			ps.setString(2, em.getEmpName());
			ps.setString(3, em.getEmpLastName());
			ps.setString(4, em.getEmpPassword());
			ps.setString(5,  em.getEmpLogin());
			employeeInfoCreated = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		// TODO Auto-generated method stub
		return employeeInfoCreated;
	}

	public String updateEmployeeInfo(EmployeeInfo em) {
		String employeeInfoUpdated =  " ";
		String sql = "update employeeinfo "
				+ "set empid = ?,"
				+ "empname = ?,"
				+ "emplastname = ?,"
				+ "emppassword = ?,"
				+ "emplogin = ?";
		
		try(Connection c = ConnectionUtil.getConnection();
				PreparedStatement ps = c.prepareStatement(sql)) {
			
			ps.setInt(1,  em.getEmpId());
			ps.setString(2, em.getEmpName());
			ps.setString(3, em.getEmpLastName());
			ps.setString(4, em.getEmpPassword());
			ps.setString(5,  em.getEmpLogin());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		return employeeInfoUpdated;
	}

	public int deleteEmployeeStuff(EmployeeInfo em) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmployeeInfo getEmployeeInfoByUsername(String u) {
		System.out.println("Employeedaoimpl getemployeeinfobyUsername");
		String sql = "select * from employeeinfo where emplogin = ?";
		EmployeeInfo em = null;
		try(Connection c = ConnectionUtil.getConnection();
				PreparedStatement ps = c.prepareStatement(sql)){
			
			ps.setString(1, u);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int employeeId = rs.getInt("empid");
				String employeeLogin = rs.getString("emplogin");
				String employeeName = rs.getString("empname");
				String empLastName = rs.getString("emplastname");
				String employeePassword = rs.getString("empassword");
				 em = new EmployeeInfo(employeeId, employeeLogin, employeeName, empLastName,employeePassword );
				
			}
			
			rs.close();
			//ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return em;
	}

}
