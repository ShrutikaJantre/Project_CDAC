package com.homeservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.homeservice.entities.CustomerSignup;

@Component
public interface CustomerRepository extends CrudRepository<CustomerSignup, Integer> {

}
