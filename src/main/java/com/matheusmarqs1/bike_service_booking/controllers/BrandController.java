package com.matheusmarqs1.bike_service_booking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmarqs1.bike_service_booking.entities.Brand;
import com.matheusmarqs1.bike_service_booking.services.BrandService;

@RestController
@RequestMapping(value = "/brands")
public class BrandController {
	
	@Autowired
	private BrandService service;
	
	@GetMapping
	public ResponseEntity<List<Brand>> findAll(){
		List<Brand> brands = service.findAll();
		return ResponseEntity.ok().body(brands);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Brand> findById(@PathVariable Long id){
		Brand brand = service.findById(id);
		return ResponseEntity.ok().body(brand);
	}
	
}
