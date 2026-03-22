package com.matheusmarqs1.bike_service_booking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmarqs1.bike_service_booking.entities.Bike;
import com.matheusmarqs1.bike_service_booking.services.BikeService;

@RestController
@RequestMapping(value = "/bikes")
public class BikeController {
	
	@Autowired
	private BikeService service;
	
	@GetMapping
	public ResponseEntity<List<Bike>> findAll(){
		List<Bike> bikes = service.findAll();
		return ResponseEntity.ok().body(bikes);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Bike> findById(@PathVariable Long id){
		Bike bike = service.findById(id);
		return ResponseEntity.ok().body(bike);
	}
	
}
