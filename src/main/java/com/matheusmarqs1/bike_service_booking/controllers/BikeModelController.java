package com.matheusmarqs1.bike_service_booking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmarqs1.bike_service_booking.entities.BikeModel;
import com.matheusmarqs1.bike_service_booking.services.BikeModelService;

@RestController
@RequestMapping(value = "/bike-models")
public class BikeModelController {
	
	@Autowired
	private BikeModelService service;
	
	@GetMapping
	public ResponseEntity<List<BikeModel>> findAll(){
		List<BikeModel> bikeModels = service.findAll();
		return ResponseEntity.ok().body(bikeModels);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<BikeModel> findById(@PathVariable Long id){
		BikeModel bikeModel = service.findById(id);
		return ResponseEntity.ok().body(bikeModel);
	}
	
}
