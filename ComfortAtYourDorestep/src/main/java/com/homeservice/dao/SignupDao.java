package com.homeservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.homeservice.entities.Address;
import com.homeservice.entities.Admin;
import com.homeservice.entities.Signup;

@Component
public class SignupDao {

	@Autowired
	private ISignup iSignup;
	
	public List<Signup> getAllserviceprovider() {
        List<Signup> list=(List<Signup>)this.iSignup.findAll();
        return list;
    }

	public Signup addserviceProvider(Signup obj) {
		// TODO Auto-generated method stub
		Signup result=iSignup.save(obj);
		return result;
       
		
	}

	
	public Signup loginUser(String email, String password) {
		
		
			return iSignup.getUserByUsernamePassword(email, password);
	
	}

	public List<Integer> getid(String hobby) {
		return iSignup.getId(hobby);
		
	}

	public Signup getpass(int addressid) {
		return iSignup.getPassword(addressid);

	}

	public void setNewPass(String password, String newpassword) {
		
		 iSignup.setNewPassword(password,newpassword);
		
	}

	public Signup getResult(String newpassword) {
		
		return iSignup.getResult(newpassword);
	}

	public Address addAddressr(Address address) {
		return iSignup.save(address);
		
	}

	

	
	
	
}
