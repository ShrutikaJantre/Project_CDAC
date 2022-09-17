package com.homeservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Address_tbl")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String hobby;
	private String houseno;
	private String street;
	private String city;
	private String state;
	private int pincode;
	
	
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Address(String hobby, String houseno, String street, String city, String state, int pincode) {
		super();
		this.hobby = hobby;
		this.houseno = houseno;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}





	public int getId() {
		return id;
	}



	





	public void setId(int id) {
		this.id = id;
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
		return "Address [id=" + id + ", hobby=" + hobby + ", houseno=" + houseno + ", street=" + street + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
}
