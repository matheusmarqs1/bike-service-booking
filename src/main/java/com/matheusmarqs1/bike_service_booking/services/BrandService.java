package com.matheusmarqs1.bike_service_booking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusmarqs1.bike_service_booking.entities.Brand;
import com.matheusmarqs1.bike_service_booking.repositories.BrandRepository;

@Service
public class BrandService {
	
	@Autowired
	private BrandRepository repository;
	
	public List<Brand> findAll(){
		return repository.findAll();
	}
	
	public Brand findById(Long id) {
		return repository.findById(id).get();
	}

}
