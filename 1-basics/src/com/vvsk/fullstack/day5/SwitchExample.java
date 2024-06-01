package com.vvsk.fullstack.day5;

import java.util.Scanner;

/**
 * Demonstrate program to print the day of week using switch case
 */
public class SwitchExample {

	public static void main(String[] args) {
		
		// Print Day of Week by taking input number 1-7 from user
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the number of day from 1 to 7 : ");
		
		int dayOfWeek = sc.nextInt();
		
		switch(dayOfWeek) {
		
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THURSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SATURDAY");
			break;
		default:
			System.out.println("Not a valid input");
			break;
		
		}
		
		sc.close();

	}

}
