package com.vvsk.fullstack.day5;

/**
 * Demonstrate java program for condition statements
 */
public class IfElseExample {

	public static void main(String[] args) {
		
		int number = 4;
		
		if(number > 20) {
			System.out.println("Number is greater than 20");
		}
		else if(number > 10) {
			System.out.println("number is greater than 10");
		}
		else if(number > 5) {
			System.out.println("Number is greater than 5");
		}
		else {
			System.out.println("Number is not greater than 5");
		}
		
		System.out.println("Done checking the number");
	}

}
