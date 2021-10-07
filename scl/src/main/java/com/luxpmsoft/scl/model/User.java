package com.luxpmsoft.scl.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="email")
    private String email;
	
	@Column(name="username")
    private String username;
	
	@Column(name="password")
    private String password;
	
	@Column(name="mobile")
    private String mobile;
	
	@Column(name="status")
    private String status;
	
	@Column(name="birthdate")
    private String birthdate;
	
	@Column(name="modby")
    private String modby;
	
	@Column(name="moddate")
    private Timestamp moddate;
	
	@Column(name="creby")
    private String creby;
	
	@Column(name="credate")
    private Timestamp credate;
	
	@Column(name="role")
    private String role;

    public User() {
    }

	/**
	 * @param id
	 * @param email
	 * @param name
	 * @param password
	 * @param mobile
	 * @param status
	 * @param birthdate
	 * @param modby
	 * @param moddate
	 * @param creby
	 * @param credate
	 * @param role
	 */
	public User(Long id, String email, String username, String password, String mobile, String status, String birthdate,
			String modby, Timestamp moddate, String creby, Timestamp credate, String role) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.status = status;
		this.birthdate = birthdate;
		this.modby = modby;
		this.moddate = moddate;
		this.creby = creby;
		this.credate = credate;
		this.role = role;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the birthdate
	 */
	public String getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * @return the modby
	 */
	public String getModby() {
		return modby;
	}

	/**
	 * @param modby the modby to set
	 */
	public void setModby(String modby) {
		this.modby = modby;
	}

	/**
	 * @return the moddate
	 */
	public Timestamp getModdate() {
		return moddate;
	}

	/**
	 * @param moddate the moddate to set
	 */
	public void setModdate(Timestamp moddate) {
		this.moddate = moddate;
	}

	/**
	 * @return the creby
	 */
	public String getCreby() {
		return creby;
	}

	/**
	 * @param creby the creby to set
	 */
	public void setCreby(String creby) {
		this.creby = creby;
	}

	/**
	 * @return the credate
	 */
	public Timestamp getCredate() {
		return credate;
	}

	/**
	 * @param credate the credate to set
	 */
	public void setCredate(Timestamp credate) {
		this.credate = credate;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password + ", mobile="
				+ mobile + ", status=" + status + ", birthdate=" + birthdate + ", modby=" + modby + ", moddate="
				+ moddate + ", creby=" + creby + ", credate=" + credate + ", role=" + role + "]";
	}  
    
	
}