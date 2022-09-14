package com.homeservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.homeservice.entities.Employee;

public interface IEmployee extends CrudRepository<Employee, Integer>{
	
	public Employee save(Employee emp);
	
	@Modifying
	@Query("select o from Employee o ")
	List<Employee> getall();
	
	public Employee findById(int id);

}
