package com.revature.projectone.howard.model;

public class ManagerInfo {
	
	private static final long serialVersionUID =1L;
	
	private int manId; 
	private String manLogin;
	private String manName;
	private String manLastname;
	private String manPassword;
	
	
	public ManagerInfo() {
		super();
	}
	
	public ManagerInfo(int managerId, String managerLogin, String managerName, String managerLastName, String managerPassword) {
		super();
		manId = managerId;
		manLogin = managerLogin;
		manName = managerName;
		manLastname = managerLastName;
		manPassword = managerPassword;
		

}

	@Override
	public String toString() {
		return "ManagerInfo [manId=" + manId + ", manLogin=" + manLogin + ", manName=" + manName + ", manLastname="
				+ manLastname + ", manPassword=" + manPassword + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + manId;
		result = prime * result + ((manLastname == null) ? 0 : manLastname.hashCode());
		result = prime * result + ((manLogin == null) ? 0 : manLogin.hashCode());
		result = prime * result + ((manName == null) ? 0 : manName.hashCode());
		result = prime * result + ((manPassword == null) ? 0 : manPassword.hashCode());
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
		ManagerInfo other = (ManagerInfo) obj;
		if (manId != other.manId)
			return false;
		if (manLastname == null) {
			if (other.manLastname != null)
				return false;
		} else if (!manLastname.equals(other.manLastname))
			return false;
		if (manLogin == null) {
			if (other.manLogin != null)
				return false;
		} else if (!manLogin.equals(other.manLogin))
			return false;
		if (manName == null) {
			if (other.manName != null)
				return false;
		} else if (!manName.equals(other.manName))
			return false;
		if (manPassword == null) {
			if (other.manPassword != null)
				return false;
		} else if (!manPassword.equals(other.manPassword))
			return false;
		return true;
	}

	public int getManId() {
		return manId;
	}

	public void setManId(int manId) {
		this.manId = manId;
	}

	public String getManLogin() {
		return manLogin;
	}

	public void setManLogin(String manLogin) {
		this.manLogin = manLogin;
	}

	public String getManName() {
		return manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}

	public String getManLastname() {
		return manLastname;
	}

	public void setManLastname(String manLastname) {
		this.manLastname = manLastname;
	}

	public String getManPassword() {
		return manPassword;
	}

	public void setManPassword(String manPassword) {
		this.manPassword = manPassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
