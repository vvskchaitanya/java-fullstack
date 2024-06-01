package com.vvsk.fullstack.polymorphism;

/**
 * Bike is child class of Vehicle
 * This has all inherited properties of Vehicle
 * Encapsulated child class
 */
public class Bike extends Vehicle {	
	
	private BikeType type;

	public Bike(String model, String color, BikeType type) {
		super("BIKE", model, color, 2);
		this.type = type;
	}

	public BikeType getType() {
		return type;
	}

	public void setBikeType(BikeType type) {
		this.type = type;
	}
	
	
	
	
	
	

}
