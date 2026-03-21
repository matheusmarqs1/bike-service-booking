package com.matheusmarqs1.bike_service_booking.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheusmarqs1.bike_service_booking.entities.Brand;
import com.matheusmarqs1.bike_service_booking.entities.Customer;
import com.matheusmarqs1.bike_service_booking.repositories.BrandRepository;
import com.matheusmarqs1.bike_service_booking.repositories.CustomerRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Brand brand1 = new Brand(null, "Caloi");
		Brand brand2 = new Brand(null, "Trek");
		Brand brand3 = new Brand(null, "Specialized");
		Brand brand4 = new Brand(null, "Other");
		
		brandRepository.saveAll(Arrays.asList(brand1, brand2, brand3, brand4));
		
		Customer customer1 = new Customer(null, "Victor", "12345678900", "victor@example.com", "62999999999");
		Customer customer2 = new Customer(null, "Ronaldo", "98765432100", "ronaldo@example.com", "62999999998");
		
		customerRepository.saveAll(Arrays.asList(customer1, customer2));
		
	}

}
