package com.hcl.PhaseOneProject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {

	@Id
	private long empId;
	private String empName;
	private String pwd;

	public User(long empId, String empName, String pwd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.pwd = pwd;
	}

	public User() {

	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
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
