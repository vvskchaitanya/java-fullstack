package com.vvsk.fullstack.day6;

/**
 * Java Program for For loop
 */
public class ForExample {

	public static void main(String[] args) {
		
		// Program for executing for loop
		
		int n = 20;
		
		System.out.println("Iterating i value by incrmenting 1");
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
		System.out.println("Iterating i value by incrmenting 2");
		for(int i=1;i<=n;i+=2) {
			System.out.println(i);
		}
		

	}

}
