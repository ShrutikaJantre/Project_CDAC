package com.homeservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.homeservice.entities.Admin;

@Component
public class AdminDao {
	
	@Autowired
	private IAdmin adminRepository;
	
	public List<Admin> getAllAdmin() {
        List<Admin> list=(List<Admin>)this.adminRepository.findAll();
        return list;
    }

}
