package com.homeservice.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name = "serviceprovider_tbl")
public class Signup{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String role;
	
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private Long phonenumber;
	
	private String password;
	
	private String confirmpassword;
	
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)  
	private Address address;

	public Signup(int id, String role, String firstname, String lastname, String email, Long phonenumber,
			String password, String confirmpassword, Address address) {
		super();
		this.id = id;
		this.role = role;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.address = address;
	}

	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Signup [id=" + id + ", role=" + role + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", phonenumber=" + phonenumber + ", password=" + password + ", confirmpassword="
				+ confirmpassword + ", address=" + address + "]";
	}  
		
	
	
	
}
