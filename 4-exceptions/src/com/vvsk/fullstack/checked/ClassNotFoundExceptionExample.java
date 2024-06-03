package com.vvsk.fullstack.checked;

/**
 * Demonstrate java program to trigger ClassNotFoundException
 */
class Person{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
}
public class ClassNotFoundExceptionExample {

	public static void main(String[] args) {
		
		
		try {
			Class doctorClass = Class.forName("com.vvsk.fullstack.checkedexceptions.Doctor");
			
			System.out.println("Hurray!!, I have found Person class");
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("There is ClassNotFoundException inside code, Trying to access class which is not present");
			e.printStackTrace();
		}
		
		
		

	}

}
