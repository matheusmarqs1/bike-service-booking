package com.matheusmarqs1.bike_service_booking.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.matheusmarqs1.bike_service_booking.entities.enums.BikeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_bike_model")
public class BikeModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer bikeType;
	
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	@JsonIgnore
	@OneToMany(mappedBy = "bikeModel")
	private Set<Bike> bikes = new HashSet<>();
	
	public BikeModel() {
	}

	public BikeModel(Long id, String name, BikeType bikeType, Brand brand) {
		super();
		this.id = id;
		this.name = name;
		setBikeType(bikeType);
		this.brand = brand;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public BikeType getBikeType() {
		return BikeType.valueOf(bikeType);
	}

	public void setBikeType(BikeType bikeType) {
		if(bikeType != null) {
			this.bikeType = bikeType.getCode();
		}
	}
	
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public Set<Bike> getBikes() {
		return bikes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BikeModel other = (BikeModel) obj;
		return Objects.equals(id, other.id);
	}

}
