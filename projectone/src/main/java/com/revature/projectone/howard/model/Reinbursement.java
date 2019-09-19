package com.revature.projectone.howard.model;

import java.io.Serializable;

public class Reinbursement implements Serializable {
	
	private static final long serialVersionID = 1L;
	
	private int reinburseId;
	private String reinburseStatus;
	private String reinburseAmount;
	private int empId;
	private int manId;



public Reinbursement() {
	super();
}

public Reinbursement(int ReinbursementId, String ReinbursementStatus, String ReinbursementAmount, int employeeId, int managerId) {
	super();
	reinburseId = ReinbursementId;
	reinburseStatus = ReinbursementStatus;
	reinburseAmount = ReinbursementAmount;
	empId = employeeId;
	manId = managerId;
}

@Override
public String toString() {
	return "Reinbursement [reinburseId=" + reinburseId + ", reinburseStatus=" + reinburseStatus + ", reinburseAmount="
			+ reinburseAmount + ", empId=" + empId + ", manId=" + manId + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empId;
	result = prime * result + manId;
	result = prime * result + ((reinburseAmount == null) ? 0 : reinburseAmount.hashCode());
	result = prime * result + reinburseId;
	result = prime * result + ((reinburseStatus == null) ? 0 : reinburseStatus.hashCode());
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
	Reinbursement other = (Reinbursement) obj;
	if (empId != other.empId)
		return false;
	if (manId != other.manId)
		return false;
	if (reinburseAmount == null) {
		if (other.reinburseAmount != null)
			return false;
	} else if (!reinburseAmount.equals(other.reinburseAmount))
		return false;
	if (reinburseId != other.reinburseId)
		return false;
	if (reinburseStatus == null) {
		if (other.reinburseStatus != null)
			return false;
	} else if (!reinburseStatus.equals(other.reinburseStatus))
		return false;
	return true;
}

public int getReinburseId() {
	return reinburseId;
}

public void setReinburseId(int reinburseId) {
	this.reinburseId = reinburseId;
}

public String getReinburseStatus() {
	return reinburseStatus;
}

public void setReinburseStatus(String reinburseStatus) {
	this.reinburseStatus = reinburseStatus;
}

public String getReinburseAmount() {
	return reinburseAmount;
}

public void setReinburseAmount(String reinburseAmount) {
	this.reinburseAmount = reinburseAmount;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public int getManId() {
	return manId;
}

public void setManId(int manId) {
	this.manId = manId;
}

public static long getSerialversionid() {
	return serialVersionID;
}
}