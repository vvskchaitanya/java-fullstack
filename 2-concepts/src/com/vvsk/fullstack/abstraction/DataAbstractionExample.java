package com.vvsk.fullstack.abstraction;

/**
 * Java Program to Demonstrate Abstraction Concept using interfaces
 */
public class DataAbstractionExample {

	public static void main(String[] args) {
		
		
		Fullstack fs = new Fullstack();
		
		fs.server();
		
		fs.client();
		
		fs.hello();
		
		/*
		Backend myBackend =  new Backend() {
			// Inline implementations of class / interface
			@Override
			public void server() {
				System.out.println("Hello this is weird we are creating instance of interface directly");
				
			}
		};
		
		myBackend.server();
		
		myBackend.hello();
		*/
		
		

	}

}
