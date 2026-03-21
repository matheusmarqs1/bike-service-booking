package com.matheusmarqs1.bike_service_booking.entities.enums;

public enum BikeType {
	
	MTB(1),
	ROAD(2),
	URBAN(3),
	KIDS(4);
	
	private int code;
	
	private BikeType(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static BikeType valueOf(int code) {
		for(BikeType type : BikeType.values()) {
			if(type.getCode() == code) {
				return type;
			}
		}
		throw new IllegalArgumentException("Invalid BikeType code");
	}
	
	
}
