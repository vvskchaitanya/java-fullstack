package com.vvsk.fullstack.polymorphism;

/**
 * Car is child class of Vehicle
 * This has all inherited properties of Vehicle
 * Encapsulated child class
 */
public class Car extends Vehicle{
	
	private CarType type;

	public Car(String model, String color, CarType type) {
		super("CAR", model, color, 4);
		this.type = type;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	
	
	
	
}
