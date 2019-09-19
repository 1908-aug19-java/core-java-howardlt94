package com.revature.projectone.howard.model;

import java.io.Serializable;

public class EmployeeInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int empId; 
	private String empLogin;
	private String empName;
	private String empLastName;
	private String empPassword;

	//public boolean getEmpId;


	public EmployeeInfo() {
			super();
	}
	
	public EmployeeInfo(int employeeId, String employeeLogin, String employeeName, String employeeLastName, String employeePassword) {
		super();
		empId = employeeId;
		empLogin = employeeLogin;
		empName = employeeName;
		empLastName = employeeLastName;
		empPassword = employeePassword;
	
		
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpLogin() {
		return empLogin;
	}

	public void setEmpLogin(String empLogin) {
		this.empLogin = empLogin;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastname) {
		this.empLastName = empLastname;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empLastName == null) ? 0 : empLastName.hashCode());
		result = prime * result + ((empLogin == null) ? 0 : empLogin.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empPassword == null) ? 0 : empPassword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeInfo other = (EmployeeInfo) obj;
		if (empId != other.empId)
			return false;
		if (empLastName == null) {
			if (other.empLastName != null)
				return false;
		} else if (!empLastName.equals(other.empLastName))
			return false;
		if (empLogin == null) {
			if (other.empLogin != null)
				return false;
		} else if (!empLogin.equals(other.empLogin))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empPassword == null) {
			if (other.empPassword != null)
				return false;
		} else if (!empPassword.equals(other.empPassword))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [empId=" + empId + ", empLogin=" + empLogin + ", empName=" + empName + ", empLastname="
				+ empLastName + ", empPassword=" + empPassword + "]";
	}

	

	
}


