package com.vvsk.fullstack.encapsulation;

/**
 * Access Modifiers - private, public
 */
public class AccessModifiers {
	
	// Private Access Modifier - only accessible within class
	private String privateField = "I am private field";
	
	// Default Access Modifier - only accessible within same package
	String defaultField = "I am default field";
	
	// Protected Access Modifier - accessible to child class
	protected String protectedField = "I am protected field";;
	
	// Public Access Modifier - accessible to child class
	public String publicField = "I am public field";
	
	
	public static void main(String args[]) {
		
		AccessModifiers example = new AccessModifiers();
		
		System.out.println(example.privateField);
		
		System.out.println(example.defaultField);
		
		System.out.println(example.protectedField);
		
		System.out.println(example.publicField);
		
		
	}
	
	
	

}
