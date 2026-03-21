package com.matheusmarqs1.bike_service_booking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusmarqs1.bike_service_booking.entities.BikeModel;
import com.matheusmarqs1.bike_service_booking.repositories.BikeModelRepository;

@Service
public class BikeModelService {
	
	@Autowired
	private BikeModelRepository repository;
	
	public List<BikeModel> findAll(){
		return repository.findAll();
	}
	
	public BikeModel findById(Long id) {
		return repository.findById(id).get();
	}

}
