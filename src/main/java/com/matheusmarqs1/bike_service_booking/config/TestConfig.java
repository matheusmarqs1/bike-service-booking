package com.matheusmarqs1.bike_service_booking.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheusmarqs1.bike_service_booking.entities.Customer;
import com.matheusmarqs1.bike_service_booking.repositories.CustomerRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Customer customer1 = new Customer(null, "Victor", "12345678900", "victor@example.com", "62999999999");
		Customer customer2 = new Customer(null, "Ronaldo", "98765432100", "ronaldo@example.com", "62999999998");
		
		customerRepository.saveAll(Arrays.asList(customer1, customer2));
		
	}

}
