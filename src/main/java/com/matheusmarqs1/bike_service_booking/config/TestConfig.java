package com.matheusmarqs1.bike_service_booking.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheusmarqs1.bike_service_booking.entities.BikeModel;
import com.matheusmarqs1.bike_service_booking.entities.Brand;
import com.matheusmarqs1.bike_service_booking.entities.Customer;
import com.matheusmarqs1.bike_service_booking.entities.enums.BikeType;
import com.matheusmarqs1.bike_service_booking.repositories.BikeModelRepository;
import com.matheusmarqs1.bike_service_booking.repositories.BrandRepository;
import com.matheusmarqs1.bike_service_booking.repositories.CustomerRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private BrandRepository brandRepository;
	
	@Autowired
	private BikeModelRepository bikeModelRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Brand brand1 = new Brand(null, "Caloi");
		Brand brand2 = new Brand(null, "Trek");
		Brand brand3 = new Brand(null, "Specialized");
		
		BikeModel bikeModel1 = new BikeModel(null, "Explorer", BikeType.URBAN, brand1);
		BikeModel bikeModel2 = new BikeModel(null, "Marlin", BikeType.MTB, brand2);
		BikeModel bikeModel3 = new BikeModel(null, "Rockhopper", BikeType.MTB, brand3);
		BikeModel bikeModel4 = new BikeModel(null, "Domane", BikeType.ROAD, brand2);
		
		
		brandRepository.saveAll(Arrays.asList(brand1, brand2, brand3));
		bikeModelRepository.saveAll(Arrays.asList(bikeModel1, bikeModel2, bikeModel3, bikeModel4));
		
		
		
		Customer customer1 = new Customer(null, "Victor", "12345678900", "victor@example.com", "62999999999");
		Customer customer2 = new Customer(null, "Ronaldo", "98765432100", "ronaldo@example.com", "62999999998");
		
		customerRepository.saveAll(Arrays.asList(customer1, customer2));
		
	}

}
