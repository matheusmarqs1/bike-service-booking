package com.matheusmarqs1.bike_service_booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusmarqs1.bike_service_booking.entities.BikeModel;

public interface BikeModelRepository extends JpaRepository<BikeModel, Long> {

}
