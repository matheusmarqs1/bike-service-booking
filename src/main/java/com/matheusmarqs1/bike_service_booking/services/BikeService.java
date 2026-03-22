package com.matheusmarqs1.bike_service_booking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusmarqs1.bike_service_booking.entities.Bike;
import com.matheusmarqs1.bike_service_booking.repositories.BikeRepository;

@Service
public class BikeService {
	
	@Autowired
	private BikeRepository repository;
	
	public List<Bike> findAll(){
		return repository.findAll();
	}
	
	public Bike findById(Long id) {
		return repository.findById(id).get();
	}

}
