package com.homeservice.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.homeservice.entities.Address;
import com.homeservice.entities.Admin;
import com.homeservice.entities.Signup;

@Component
public interface ISignup extends CrudRepository<Signup, Integer> {
	
	public Signup save(Signup serviceProviderSignup);
	
	
	@Query(value ="select * from serviceprovider_tbl where email=:email and password=:password",nativeQuery = true)
	public Signup getUserByUsernamePassword(String email,String password);
	
	
	@Query(value ="select id from address_tbl where hobby=:hobby",nativeQuery = true)
	public int getId(String hobby);

	
	@Query(value ="select * from serviceprovider_tbl where address_id=:addressid",nativeQuery = true)
	public Signup getPassword(int addressid);


	@Modifying
	@Transactional
	@Query(value="update serviceprovider_tbl set password=:newpassword,confirmpassword=:newpassword where password=:password",nativeQuery = true)
	public void setNewPassword(String password, String newpassword);

	@Query(value ="select * from serviceprovider_tbl where password=:newpassword",nativeQuery = true)
	public Signup getResult(String newpassword);


	public Address save(Address address);

	
}
