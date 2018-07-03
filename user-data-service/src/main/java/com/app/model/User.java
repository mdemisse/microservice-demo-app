package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	int id;
	String fName;
	String lName;
	String email;
	String username;
	String password;
	public String getFname() {
		return fName;
	}
	public void setFname(String fname) {
		this.fName = fname;
	}
	public String getLname() {
		return lName;
	}
	public void setLname(String lname) {
		this.lName = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public User(String fname, String lname, String email, String username, String password) {
		super();
		this.fName = fname;
		this.lName = lname;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
}
