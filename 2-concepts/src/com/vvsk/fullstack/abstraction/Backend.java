package com.vvsk.fullstack.abstraction;

/**
 * Interface -  To Hide Implementation Details
 * Exposes Method to outside world
 * Only holds abstract methods without method body
 * Class should handle the method implementation
 */
public interface Backend {
	
	void server();
	
	default void hello() {
		System.out.println("Hello, this is default method present in Interface and direclty implemented in interface");
	}

}
