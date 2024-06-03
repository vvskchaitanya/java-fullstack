package com.vvsk.fullstack.unchecked;

/**
 * Demonstrate NullPointer Exception
 */
class Vehicle{
	private String name;
	
	public int wheels = 5;
	
	public Vehicle(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
public class NullPointerExceptionExample {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle("My Vehicle");
		
		System.out.println(v.getName());
		
		System.out.println(v.wheels);
		
		Vehicle v1 = null;
		
		try {
			System.out.println(v1.wheels);
			
			System.out.println(v1.getName());
			
		}catch(NullPointerException ne) {
			System.out.println("Handled Null Pointer using catch block");
		}
		
		System.out.println("Program ended");

	}

}
