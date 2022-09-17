package com.homeservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.homeservice.entities.Services;

@Component
public class ServiceDao {
	
	@Autowired
	private IService iservice;

	public Services addService(Services service) {
		// TODO Auto-generated method stub
		
		return iservice.save(service);
		
	}

	public List<Services> getAllServices() {
		// TODO Auto-generated method stub
		
		List<Services> services=(List<Services>) iservice.findAll();
		return services;
	}

}
