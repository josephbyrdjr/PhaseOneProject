package com.hcl.PhaseOneProject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {

	@Id
	private long userId;
	private String username;
	private String pwd;
	private String role;

	public User(long userId, String username, String pwd, String role) {
		super();
		this.userId = userId;
		this.username = username;
		this.pwd = pwd;
		this.role = role;
	}

	public User() {

	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", pwd=" + pwd + ", role=" + role + "]";
	}

	
}
