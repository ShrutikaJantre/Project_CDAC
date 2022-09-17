package com.homeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeservice.dao.AdminDao;
import com.homeservice.dao.AdminRepository;
import com.homeservice.entities.Admin;
import com.homeservice.entities.Branch;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {
	
	@Autowired
	private AdminDao adminDao;
	
	
	@GetMapping("/admin")
    public ResponseEntity<List<Admin>> getBooks() {

        List<Admin> list = adminDao.getAllAdmin();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }
	
	

	
}
