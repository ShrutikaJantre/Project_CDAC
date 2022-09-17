package com.homeservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity
@Table(name = "branch_tbl")
public class Branch {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int branch_id;
	private String branch_name;
	private String branch_address;
	private String branch_phone;
	
	@OneToOne(mappedBy = "branch")
	private Admin admin;
	
	
	
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Branch(int branch_id, String branch_name, String branch_address, String branch_phone, Admin admin) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_address = branch_address;
		this.branch_phone = branch_phone;
		this.admin = admin;
	}



	public int getBranch_id() {
		return branch_id;
	}



	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}



	public String getBranch_name() {
		return branch_name;
	}



	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}



	public String getBranch_address() {
		return branch_address;
	}



	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}



	public String getBranch_phone() {
		return branch_phone;
	}



	public void setBranch_phone(String branch_phone) {
		this.branch_phone = branch_phone;
	}



	public Admin getAdmin() {
		return admin;
	}



	public void setAdmin(Admin admin) {
		this.admin = admin;
	}



	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_address=" + branch_address
				+ ", branch_phone=" + branch_phone + ", admin=" + admin + "]";
	}
	
	
	
	
	
}
