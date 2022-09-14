package com.homeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.homeservice.dao.SignupDao;
import com.homeservice.entities.Address;
import com.homeservice.entities.Admin;
import com.homeservice.entities.ForgotPassword;
import com.homeservice.entities.Signup;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SignupController {
	
	@Autowired
	private SignupDao serviceProviderDao; 
	
	@GetMapping("/serviceprovider")
    public ResponseEntity<List<Signup>> getServiceprovider() {

        List<Signup> list = serviceProviderDao. getAllserviceprovider();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }
	
	
	
	
	@PostMapping("/addserviceprovider")
	//@ResponseBody
	public Signup addserviceprovider( @RequestBody Signup serviceProviderSignup) {
		
		System.out.println(serviceProviderSignup);
		
		Address address=new Address();
		address.setHobby(serviceProviderSignup.getHobby());
		address.setHouseno(serviceProviderSignup.getHouseno());
		address.setCity(serviceProviderSignup.getCity());
		address.setState(serviceProviderSignup.getState());
		address.setStreet(serviceProviderSignup.getStreet());
		address.setPincode(serviceProviderSignup.getPincode());
		
		serviceProviderSignup.setAddress(address);
		
		Address obj=this.serviceProviderDao.addAddressr(address);
		System.out.println(obj);
		
		Signup result=	this.serviceProviderDao.addserviceProvider(serviceProviderSignup);
		return result;
	}

	
	@PostMapping("/login")
	//@ResponseBody
	public String login( @RequestBody Signup serviceProviderSignup) {
		
		String email=serviceProviderSignup.getEmail();
		String password=serviceProviderSignup.getPassword();
		
		System.out.println(serviceProviderSignup);
		
		
		Signup result=	this.serviceProviderDao.loginUser(email,password);
		
		
		if(email.equals(result.getEmail())&&password.equals(result.getPassword()))
		{
			return"login successfull";	
		}
		
		return "invalide username and password";	
	}
	
	
	
	@PostMapping("/forgotpass")
	@ResponseBody
	public String forgotpass( @RequestBody ForgotPassword forgotPassword) {
		
		String hobby=forgotPassword.getHobby();
		String password=forgotPassword.getNewpassword();
		String confirmpassword=forgotPassword.getConfirmpassword();
		
		System.out.println(forgotPassword);
		
		
		int addressid=	this.serviceProviderDao.getid(hobby);
		
		System.out.println(addressid);
		
		Signup result=	this.serviceProviderDao.getpass(addressid);
		
		System.out.println(result);
		
		serviceProviderDao.setNewPass(result.getPassword(),password);
		
		Signup updatedresult=	this.serviceProviderDao.getpass(addressid);
		
		if(updatedresult.getPassword()==result.getPassword())
			return "data fetched";
		return "data not fetched";
	}
	
	
	
	@PostMapping("/resetpass")
	@ResponseBody
	public String reset( @RequestBody ForgotPassword forgotPassword) {
		
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
