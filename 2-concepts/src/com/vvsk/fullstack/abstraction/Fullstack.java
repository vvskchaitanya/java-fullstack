package com.vvsk.fullstack.abstraction;

/**
 * Implementation Class -  To provide implementation of interface
 * Example for Multiple inheritance
 */
public class Fullstack implements Backend, Frontend{

	@Override
	public void server() {
		System.out.println("Hello this is backend, we create server side apps using backed");
		
	}

	@Override
	public void client() {
		System.out.println("Hello this is frontend, we create client side apps using backed");
		
	}

}
