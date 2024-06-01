package com.vvsk.fullstack.day6;

/**
 * Java program for while loop with user input
 */
public class WhileExample {

	public static void main(String[] args) {
		// Program for executing while loop
		
		int i=1, n=10;
		
		while(i<=n) {
			System.out.println("This is "+i+" iteration");
			i++;
		}
		
		System.out.println("Final value of i is "+i);
		// Resetting i to 1
		i=1;
		
		while(i<=n) {
			System.out.println("This is "+i+" iteration");
			i+=2;
		}
		
		System.out.println("Final value of i is "+i);

	}

}
