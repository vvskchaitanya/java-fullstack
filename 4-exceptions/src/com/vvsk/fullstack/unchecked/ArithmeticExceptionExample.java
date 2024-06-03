package com.vvsk.fullstack.unchecked;

/**
 * Java Program to Demonstrate Arithmetic Exception 
 */
public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		
		try {
			
			 int num = 30 /0;
		} 
		catch (ArithmeticException e) {
			System.out.println("Hello, Arithmetic Exception occurs, cannot divide by 0");
		} 
		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("End of the code");

	}

}
