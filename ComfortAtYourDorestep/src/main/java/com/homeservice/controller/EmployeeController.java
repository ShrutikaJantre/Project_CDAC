package com.homeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeservice.dao.EmployeeDao;
import com.homeservice.entities.Admin;
import com.homeservice.entities.Employee;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDao  employeeDao; 
	
	@GetMapping("/get-emp")
    public ResponseEntity<List<Employee>> getBooks() {

        List<Employee> list = employeeDao.getAllAdmin();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
        
       
    }
	
	
	@PostMapping("/add-emp")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		System.out.println(emp);
		
		
		Employee result=employeeDao.addEmployee(emp);
		return result;
	}
	
	
	@DeleteMapping("/deleteemp/{id}")
    public ResponseEntity<Void> deleteemp(@PathVariable("id") int id) {
        try {
            this.employeeDao.deleteemp(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
	

}
