package com.vvsk.fullstack.day3;

/**
 * Java Program to demonstrate the comparisional / relational operators
 * Equals == 
 * Not Equals !=
 * Greater than >
 * Less than <
 * Greater than or equal to >=
 * Less than or equal to <=
 */
public class RelationalOperators {

	public static void main(String[] args) {
		
		
		int num1 = 50;
	    int num2 = 50;
	    
	    System.out.println(num1+" is equal to "+num2+" " +(num1 == num2) );
	    
	    int num3 = 50;
	    int num4 = 50;
	    
	    System.out.println(num3+" is not equal to "+num4+" " +(num3 != num4) );
	    
	    
	    num1 = 10;
	    num2 = 50;

	    
	    System.out.println(num1+" is greater than  "+num2+" " +(num1 > num2) );
	    

	    num1 = 10;
	    num2 = 50;
	    
	    
	    System.out.println(num1+" is less than "+num2+" " +(num1 < num2) );
	    

	}

}
