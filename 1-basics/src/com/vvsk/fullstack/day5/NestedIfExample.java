package com.vvsk.fullstack.day5;

/**
 * Demonstrate Nested If Else Program
 */
public class NestedIfExample {
	
	public static void main(String args[]) {
		
		// Given three numbers, Print the number which is highest 
		int x = 100;
		int y = 200;
		int z = 300;
		
		if( x > y) {
			// Here x is greater
			if(x > z) {
				// Here X is greatest
				System.out.println("X is greatest");
			}else {
				// Here Z is greatest
				System.out.println("Z is greatest");
			}
			
		}
		else {
			// Here Y is greater
			if(y > z) {
				// Here Y is greatest
				System.out.println("Y is greatest");
			}else {
				// Here Z is greatest
				System.out.println("Z is greatest");
			}
			
		}
		
	}

}
