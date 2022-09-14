package com.homeservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.homeservice.entities.Admin;
import com.homeservice.entities.CustomerSignup;

@Component
public class CustomerDao {
	
	@Autowired
	private CustomerRepository customerRepository;

	public List<CustomerSignup> getAllCustomers() {
		List<CustomerSignup> list=(List<CustomerSignup>)this.customerRepository.findAll();
		return list;
	}

}
