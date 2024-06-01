package com.fullstack.day7;

/**
 * Java Program to demonstrate continue statement
 */
public class ContinueStatement2 {

	public static void main(String[] args) {
		
		// Print only numbers within range of  1 -  100 and not a multiple of 5
	
		
		for(int i = 1;i<=100;i++) {
			// to check if the given number is multiple of 5 and then use continue to skip those numbers
			if(i%5==0) {
				continue;
			}
			// below code will only be executed for numbers which are not multiple of 5
			System.out.println(i);
		}

	}

}
