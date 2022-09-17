package com.homeservice.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class SignupDto {
	
	@NotBlank
	private String firstname;
	
	
	private String lastname;
	
	@Email
	private String email;
	
	private Long phonenumber;
	
	private String password;
	
	private String confirmpassword;
	
	
	private String hobby;
	
	private String houseno;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private int pincode;
	
	
	public SignupDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignupDto(String firstname, String lastname, String email, Long phonenumber, String password,
			String confirmpassword, String hobby, String houseno, String street, String city, String state,
			int pincode) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.hobby = hobby;
		this.houseno = houseno;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
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
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "SignupDto [ firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", phonenumber=" + phonenumber + ", password=" + password + ", confirmpassword=" + confirmpassword
				+ ", hobby=" + hobby + ", houseno=" + houseno + ", street=" + street + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "]";
	}
	
	

}
