package com.vvsk.fullstack.day3;

/***
 * Demonstrate program for data manipulation using unary operators
 */
public class UnaryOperators {

	public static void main(String[] args) {

		// Declaring integers num1 and num2
		
		int num1=100;
	    int num2=200;

	    //minus(-) unary operator
	    int inverseNum = -num1;
	    System.out.println("Opposite of num1: "+inverseNum);

	    //post increment operator
	    num1++;
	    System.out.println("num1++ is: "+num1);
	    
	    // pre increment operator
	    ++num1;
	    System.out.println("++num1 is: "+num1);

	    //post decrement operator
	    num2--;
	    System.out.println("num2-- is: "+num2);
	    
	    //pre decrement operator
	    --num2;
	    System.out.println("--num2 is: "+num2);
	    
	    
	    
	    // NOT operator ! for Boolean data types
	    boolean completed = false;
	    
	    System.out.println(completed);
	    
	    System.out.println(!completed);
	       
	    System.out.println(completed);
	    
	    completed = !completed;
	    
	    System.out.println(completed);
	    
	    

	}

}
