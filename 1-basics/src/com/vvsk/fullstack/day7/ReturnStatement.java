package com.fullstack.day7;

/**
 * Java Program to demonstrate return statement
 */
public class ReturnStatement {

	public static void main(String[] args) {
		// Demonstrate return statement
		for(int i =1;i<=20;i++) {
			if(i==15) {
				return;
			}
			System.out.println("Current Value "+i);
		}
	}

}
