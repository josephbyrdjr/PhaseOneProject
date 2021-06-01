package com.hcl.PhaseOneProject.model;

public class User {

	private String empId;
	private String empName;
	private String pwd;

	public User(String empId, String empName, String pwd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.pwd = pwd;
	}

	public User() {

	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [empId=" + empId + ", empName=" + empName + ", pwd=" + pwd + "]";
	}

}
