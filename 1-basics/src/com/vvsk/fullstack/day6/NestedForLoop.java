package com.vvsk.fullstack.day6;


/**
 * Java Program for Nested For loop
 */
public class NestedForLoop {

	public static void main(String[] args) {
		// Simple Program for Nested For loop
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				// Printing (i,j)
				System.out.print("("+i+","+j+")"+" ");
			}
			System.out.print("\n");
		}
		
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				// Printing (i,j)
				System.out.print(i+""+j+" ");
			}
			System.out.print("\n");
		}
		
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				// Printing (i,j)
				if(i==j) {
					System.out.print("* ");
				}else {
					System.out.print(j+" ");
				}
				
			}
			System.out.print("\n");
		}
	}

}
