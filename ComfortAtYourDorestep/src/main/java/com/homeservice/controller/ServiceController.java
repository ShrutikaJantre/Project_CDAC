package com.homeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeservice.dao.ServiceDao;
import com.homeservice.entities.Employee;
import com.homeservice.entities.Services;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ServiceController {
	
	@Autowired
	private ServiceDao serviceDao;
	
	
	@GetMapping("/getservice")
    public ResponseEntity<?> getServices() {

        List<Services> list = serviceDao.getAllServices();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
        
       
    }
	
	
	
	
	@PostMapping("/addservice")
	//@ResponseBody
	public ResponseEntity<?>  addserviceprovider( @RequestBody Services service) {
	
				
			 Services result=serviceDao.addService(service);
			 
			 return ResponseEntity.ok(result);
		
	}

}
