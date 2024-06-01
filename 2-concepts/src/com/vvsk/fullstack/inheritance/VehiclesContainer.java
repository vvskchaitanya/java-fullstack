package com.fullstack.oops.polymorphism;

import java.util.Scanner;

/**
 * Vehicle Container is the main functionality which uses the encapsulated classes / models
 * This has methods to addVechicle to container and showVehicles present in container
 */
public class VehiclesContainer {
	
	public static final int MAX_VEHICLES = 10;
	
	// Initializing the vehicles array with max size
	private Vehicle[] vehicles= new Vehicle[MAX_VEHICLES];
	
	// To determine the count of vehicles loaded into the container
	private int count = 0;
	
	private Scanner scanner = new Scanner(System.in);
	
	public void addVehicle() {
		if(count==MAX_VEHICLES) {
			System.out.println("Container is full, Cannot add more Vehicles");
		}else {
			System.out.println("Enter the type of vehicle (car/bike): ");
			String type = scanner.next().toLowerCase();
			switch(type) {
				case "bike":
					this.vehicles[count] = addBike();
					count++;
					break;
				case "car":
					this.vehicles[count] = addCar();
					count++;
					break;
				default:
					System.out.println("Cannot add vehicle of unknown type");
					break;
			}
		}
	}
	
	public void showVehicles() {
		System.out.println("==================================================");
		for(int i=0;i<count;i++) {
			System.out.println(vehicles[i]);
		}
	}
	
	
	private Bike addBike() {
		System.out.println("Enter the model of Bike");
		String model = scanner.next();
		System.out.println("Enter the color of Bike: ");
		String color = scanner.next();
		System.out.println("Enter the type of Bike (STANDARD/REGULAR): ");
		String type = scanner.next().toUpperCase();
		BikeType bikeType = BikeType.getType(type);
		return new Bike(model,color,bikeType);
	}
	
	private Car addCar() {
		System.out.println("Enter the model of Car");
		String model = scanner.next();
		System.out.println("Enter the color of Car: ");
		String color = scanner.next();
		System.out.println("Enter the type of Car (SUV/SEDAN/SPORTS): ");
		String type = scanner.next();
		CarType carType = CarType.getType(type);
		return new Car(model,color,carType);
	}
	
	
	
	

}
