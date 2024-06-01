package com.vvsk.fullstack.encapsulation;

/**
 * Encapsulation Example
 */
public class VehiclesExample {

	public static void main(String[] args) {
		
		Vehicle bike = new Vehicle("Black",2);
		
		Vehicle car = new Vehicle("Red",4);
		
		Vehicle auto = new Vehicle("Yellow",3);
		
		System.out.println("Bike Color : "+bike.getColor());
		
		System.out.println("Car Color : "+car.getColor());
		
		System.out.println("Auto Color : "+auto.getColor());
		
		car.setColor("White");
		
		System.out.println("Car Color : "+car.getColor());
		

	}

}
