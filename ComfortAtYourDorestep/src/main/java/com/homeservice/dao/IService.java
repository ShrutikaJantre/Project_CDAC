package com.homeservice.dao;

import org.springframework.data.repository.CrudRepository;


import com.homeservice.entities.Services;

public interface IService extends CrudRepository<Services, Integer> {
	@SuppressWarnings("unchecked")
	public Services save(Services service);
}
