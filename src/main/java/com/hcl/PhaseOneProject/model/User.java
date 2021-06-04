package com.hcl.PhaseOneProject.model;

import javax.persistence.*;


@Entity
@Table(name="users")
public class User {

	@Id
	@Column(name = "id")
	private long id;
	private String username;
	private String password;
	private boolean enabled;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Authorities authorities = new Authorities();

	public User(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		enabled = true;
	}

	public Authorities getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Authorities authorities) {
		this.authorities = authorities;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public User() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + id + ", username=" + username + ", pwd=" + password + "]";
	}

	
}
