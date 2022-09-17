package com.homeservice.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity
@Table(name = "admin_tbl")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String gender;
	private String email;
	private String phoneno;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Branch branch;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, String gender, String email, String phoneno, String password, Branch branch) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phoneno = phoneno;
		this.password = password;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", phoneno=" + phoneno
				+ ", password=" + password + ", branch=" + branch + "]";
	}
	
	
	
}
