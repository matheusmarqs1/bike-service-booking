package com.matheusmarqs1.bike_service_booking.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheusmarqs1.bike_service_booking.entities.Bike;
import com.matheusmarqs1.bike_service_booking.entities.BikeModel;
import com.matheusmarqs1.bike_service_booking.entities.Brand;
import com.matheusmarqs1.bike_service_booking.entities.Customer;
import com.matheusmarqs1.bike_service_booking.entities.enums.BikeType;
import com.matheusmarqs1.bike_service_booking.repositories.BikeModelRepository;
import com.matheusmarqs1.bike_service_booking.repositories.BikeRepository;
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
	
	@Autowired
	private BikeRepository bikeRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Brand brand1 = new Brand(null, "Caloi");
		Brand brand2 = new Brand(null, "Trek");
		Brand brand3 = new Brand(null, "Specialized");
		
		BikeModel bikeModel1 = new BikeModel(null, "Explorer", BikeType.URBAN, brand1);
		BikeModel bikeModel2 = new BikeModel(null, "Marlin", BikeType.MTB, brand2);
		BikeModel bikeModel3 = new BikeModel(null, "Rockhopper", BikeType.MTB, brand3);
		BikeModel bikeModel4 = new BikeModel(null, "Domane", BikeType.ROAD, brand2);
		
		// GENERIC MODELS (for customers who don't know their model)
		BikeModel bikeModel5 = new BikeModel(null, "Unknown Model", BikeType.URBAN, brand1);
        BikeModel bikeModel6 = new BikeModel(null, "Unknown Model", BikeType.MTB, brand2);
        BikeModel bikeModel7 = new BikeModel(null, "Unknown Model", BikeType.MTB, brand3);
		
		
		brandRepository.saveAll(Arrays.asList(brand1, brand2, brand3));
		bikeModelRepository.saveAll(Arrays.asList(bikeModel1, bikeModel2, bikeModel3, bikeModel4, bikeModel5, bikeModel6, bikeModel7));
		

		Customer customer1 = new Customer(null, "Victor", "12345678900", "victor@example.com", "62999999999");
		Customer customer2 = new Customer(null, "Ronaldo", "98765432100", "ronaldo@example.com", "62999999998");
		
		Bike bike1 = new Bike(null, "Daily Ride", "Used for commuting to work", bikeModel1, customer1);
		Bike bike2 = new Bike(null, "Trail Beast", "Weekend trail rides", bikeModel2, customer1);
		Bike bike3 = new Bike(null, "Speed Machine", "Road training sessions", bikeModel4, customer2);
		Bike bike4 = new Bike(null, "My old red bike", "Caloi I got in 2018, don't know the exact model", bikeModel5, customer2);
		
		customerRepository.saveAll(Arrays.asList(customer1, customer2));
		bikeRepository.saveAll(Arrays.asList(bike1, bike2, bike3, bike4));
		
		
	}

}
