package com.vvsk.fullstack.polymorphism;

/**
 * This is base class (parent class) 
 * Vehicle - Encapsulated class - private members and public getter / setter
 */
public class Vehicle {
	
	private String name;
	
	private String model;
	
	private String color;
	
	private int wheels;

	public Vehicle(String name, String model, String color, int wheels) {
		super();
		this.name = name;
		this.model = model;
		this.color = color;
		this.wheels = wheels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + ", color=" + color + ", wheels=" + wheels + "]";
	}
	
	
	
	
}
