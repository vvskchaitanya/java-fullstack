package com.vvsk.fullstack.day4;

import java.util.Scanner;

/**
 * Demostrate the Program to grab the user input from console and assign it to variable
 */
public class TakeUserInput {

	public static void main(String[] args) {
		
	
		// System.in means the input stream from console
		// System.out means output stream into console 

		Scanner scanner = new Scanner(System.in);
		
		int x = 100;
		
		System.out.println("Current Value of x: "+x);
		
		System.out.println("Enter the new  value of x:");
		
		x = scanner.nextInt();
		
		System.out.println("Updated Value of x: "+x);
		
		System.out.println( x>=500? "X is greather than 500" : "X is less than 500");
		
		if(x>=500) {
			System.out.println("X is greater than 500");
		}else {
			System.out.println("X is less than 500");
		}
		
		String name="";
		
		
		System.out.println("Enter your name:");
		
		name = scanner.next();
		
		System.out.println("Welcome "+name);
		
		scanner.close();

	}

}
