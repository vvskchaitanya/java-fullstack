package com.vvsk.fullstack.exceptions;

public class TryCatchExceptionExample {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} 
		catch (IndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} 
		catch (ArithmeticException e) {
			System.out.println("Hello, Arithmetic Exception occurs");
		} 
		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("End of the code");

	}
}
