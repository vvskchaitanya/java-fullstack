package com.fullstack.day7;

/**
 * Java Program to demonstrate continue statement
 */
public class ContinueStatement {

	public static void main(String[] args) {
		
		// Print only even numbers from 1 -  100
		
		int n = 100;
		
		for(int i = 1;i<=n;i++) {
			// to check if the given number is odd number and then use continue to skip odd numbers
			if(i%2==1) {
				continue;
			}
			// below code will only be executed for even numbers
			System.out.println(i);
		}
		
		
		// Print only even numbers from 1 -  100
		
			
		for(int i = 1;i<=n;i++) {
			// to check if the given number is even number and then use continue to skip even numbers
			if(i%2==0) {
				continue;
			}
			// below code will only be executed for odd numbers
			System.out.println(i);
		}

	}

}
