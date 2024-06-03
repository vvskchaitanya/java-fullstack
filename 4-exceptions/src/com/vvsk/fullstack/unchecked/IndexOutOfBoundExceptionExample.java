package com.vvsk.fullstack.unchecked;

/**
 * Java Program to Demonstrate IndexOutOfBound Exception 
 */
public class IndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		
		int[] numbers = new int [10];
		
		try {
			numbers[0]=10;
			numbers[1]=11;
			numbers[2]=12;
			numbers[11]=13;
			 
		} 
		catch (ArithmeticException e) {
			System.out.println("Hello, IndexOutOfBoundException Exception occurs, cannot access invalid index");
		} 
		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("End of the code");

	}

}
