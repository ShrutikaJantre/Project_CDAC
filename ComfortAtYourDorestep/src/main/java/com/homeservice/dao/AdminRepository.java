package com.homeservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.homeservice.entities.Admin;

@Component
public interface AdminRepository extends CrudRepository<Admin, Integer> {

	public Admin save(Admin admin);

	//public List<Admin> getAllAdmin();
	

}
