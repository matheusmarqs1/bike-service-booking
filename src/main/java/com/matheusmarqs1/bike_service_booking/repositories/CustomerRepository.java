package com.matheusmarqs1.bike_service_booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusmarqs1.bike_service_booking.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
