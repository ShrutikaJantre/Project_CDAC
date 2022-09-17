package com.homeservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeservice.dao.SignupDao;
import com.homeservice.dto.ForgotPasswordDto;
import com.homeservice.dto.SignupDto;
import com.homeservice.entities.Address;
import com.homeservice.entities.Signup;
import com.homeservice.exception.ResourceNotFoundException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Validated
public class SingupController {
	
	
	@Autowired
	private SignupDao serviceProviderDao; 
	
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping("/serviceprovider")
    public ResponseEntity<?> getServiceprovider() {

        List<Signup> list = serviceProviderDao. getAllserviceprovider();
        if (list.size() <= 0) {
           // return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        	throw new ResourceNotFoundException("list is empty");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }
	
	

	
	@PostMapping("/adduser")
	//@ResponseBody
	public ResponseEntity<?> addserviceprovider(@Valid @RequestBody SignupDto dto) {
		
		Signup obj=mapper.map(dto, Signup.class);
	//	obj.setPassword(passwordEncoder.encode(obj.getPassword()));
		System.out.println(obj);
		
		Address address=mapper.map(dto, Address.class);
		
		obj.setAddress(address);
		
		
		
		Signup result=	this.serviceProviderDao.addserviceProvider(obj);
		return ResponseEntity.ok(result);
	}
	
	/*
	@PostMapping("/addserviceprovider")
	//@ResponseBody
	public String addserviceprovider( @RequestBody Signup signup,@RequestBody Address address) {
		
		System.out.println("inside the function");
		
		//Address address=(Address) obj.get(1);
		
		//Signup serviceProviderSignup=(Signup) obj.get(0);
		
		System.out.println(address);
		
		signup.setAddress(address);
		
		
		Signup result=	this.serviceProviderDao.addserviceProvider(signup);
		return "Successfull login";
				
	}
*/
	
	
	

	
	@PostMapping("/login")
	//@ResponseBody
	public  ResponseEntity<?> login( @RequestBody Signup serviceProviderSignup) {
		
		String email=serviceProviderSignup.getEmail();
		String password=serviceProviderSignup.getPassword();
		
		System.out.println(serviceProviderSignup);
		
		
		Signup result=	this.serviceProviderDao.loginUser(email,password);
		if(result==null) {
			
			throw new  ResourceNotFoundException("user not found");
		}
		
			if(email.equals(result.getEmail())&&password.equals(result.getPassword()))
		{
			return ResponseEntity.ok("login successfull");	
		}
		
		return ResponseEntity.ok("invalide username and password");	
		
	}
	
	
	
	@PostMapping("/forgotpass")
	@ResponseBody
	public ResponseEntity<?> forgotpass(@Valid @RequestBody SignupDto dto) {
		
		String hobby=dto.getHobby();
		String password=dto.getPassword();
		//String confirmpassword=forgotPassword.getConfirmpassword();
		
		System.out.println(dto);
		
		
		List<Integer> addressid=	this.serviceProviderDao.getid(hobby);
		
		System.out.println(addressid);
		
		
		for(int i=0;i<addressid.size();i++) {
			Signup result=	this.serviceProviderDao.getpass(addressid.get(i));
			
			System.out.println(result);
			
			serviceProviderDao.setNewPass(result.getPassword(),password);
			
			Signup updatedresult=	this.serviceProviderDao.getpass(addressid.get(i));
			
			if(updatedresult.getPassword()==result.getPassword())
				return ResponseEntity.ok("password changed") ;
			
		       }
		
		
		return ResponseEntity.ok("enter valid password") ;
		
	}
	
	
	
	@PostMapping("/resetpass")
	@ResponseBody
	public String reset( @RequestBody ForgotPasswordDto forgotPassword) {
		
		String oldpassword=forgotPassword.getOldpassword();
		String newpassword=forgotPassword.getNewpassword();
		String confirmpassword=forgotPassword.getConfirmpassword();
		
		System.out.println(forgotPassword);
		
		
		
		serviceProviderDao.setNewPass(oldpassword, newpassword);
		
		Signup updatedresult=this.serviceProviderDao.getResult(newpassword);
		if(updatedresult.getPassword()==newpassword)
			return "data fetched";
		    return "data not fetched";
	}
	
	
	
	
	
}
