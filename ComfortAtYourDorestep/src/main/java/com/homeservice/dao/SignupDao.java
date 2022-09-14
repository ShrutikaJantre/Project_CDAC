package com.homeservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import com.homeservice.controller.serviceProviderSignup;
import com.homeservice.entities.Address;
import com.homeservice.entities.Admin;
import com.homeservice.entities.Signup;

@Component
public class SignupDao {

	@Autowired
	private ISignup serviceProvider;
	
	public List<Signup> getAllserviceprovider() {
        List<Signup> list=(List<Signup>)this.serviceProvider.findAll();
        return list;
    }

	public Signup addserviceProvider(Signup serviceProviderSignup) {
		// TODO Auto-generated method stub
		Signup result=serviceProvider.save(serviceProviderSignup);
		return result;
       
		
	}

	
	public Signup loginUser(String email, String password) {
		
		
			return serviceProvider.getUserByUsernamePassword(email, password);
	
	}

	public int getid(String hobby) {
		return serviceProvider.getId(hobby);
		
	}

	public Signup getpass(int addressid) {
		return serviceProvider.getPassword(addressid);

	}

	public void setNewPass(String password, String newpassword) {
		
		 serviceProvider.setNewPassword(password,newpassword);
		
	}

	public Signup getResult(String newpassword) {
		
		return serviceProvider.getResult(newpassword);
	}

	public Address addAddressr(Address address) {
		return serviceProvider.save(address);
		
	}
	
	
}
