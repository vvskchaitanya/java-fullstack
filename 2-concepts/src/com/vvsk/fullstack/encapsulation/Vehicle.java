package com.vvsk.fullstack.encapsulation;

/**
 * Encapsulated class having private fields
 */
public class Vehicle {
	
	// Private field - not accessible outside this class
	private String color;
	
	private int wheels;
	
	public Vehicle(String color, int wheels) {
		this.color = color;
		this.wheels = wheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	
	
	

}
