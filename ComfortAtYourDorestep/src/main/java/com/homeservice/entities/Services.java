package com.homeservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "service_tbl")
public class Services {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int serviceid;
	
	private String tagline;
	private String title;
	private String shortdescription;
	private String longdescription;
	private String city;
	private String state;
	private String zipcode;
	private int servicecharge;
	private int tax;
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Services(String tagline, String title, String shortdescription, String longdescription, String city,
			String state, String zipcode, int servicecharge, int tax) {
		super();
		this.tagline = tagline;
		this.title = title;
		this.shortdescription = shortdescription;
		this.longdescription = longdescription;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.servicecharge = servicecharge;
		this.tax = tax;
	}
	public int getServiceid() {
		return serviceid;
	}
	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShortdescription() {
		return shortdescription;
	}
	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}
	public String getLongdescription() {
		return longdescription;
	}
	public void setLongdescription(String longdescription) {
		this.longdescription = longdescription;
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
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public int getServicecharge() {
		return servicecharge;
	}
	public void setServicecharge(int servicecharge) {
		this.servicecharge = servicecharge;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Services [serviceid=" + serviceid + ", tagline=" + tagline + ", title=" + title + ", shortdescription="
				+ shortdescription + ", longdescription=" + longdescription + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + ", servicecharge=" + servicecharge + ", tax=" + tax + "]";
	}
	
	
}
