package com.course.springbootstarter.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NamedQueries({
@NamedQuery(name="Users.findAll", 
        query="SELECT u FROM Users u"),
@NamedQuery(name="Users.findByUsername", 
        query="SELECT u FROM Users u WHERE u.username = ?1")
})
public class Users {
	//username varchar(50)
	//password varchar(100)
	//full_name varchar(100)
	//role varchar(50)
	//country varchar(100)
	//enabled tinyint(1)
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="full_name")
	private String fullName;
	@Column(name="role")
	private String role;
	@Column(name="country")
	private String country;
	@Column(name="enabled")
//	private int enabled;
	private Boolean enabled;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
//	public int getEnabled() {
	public Boolean getEnabled() {
//		if (enabled.equal(null)) {enabled = 0;}
		return enabled;
	}
//	public void setEnabled(int enabled) {
	public void setEnabled(Boolean enabled){
		this.enabled = enabled;
	}
	
}
