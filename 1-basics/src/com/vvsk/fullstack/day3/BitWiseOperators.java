package com.vvsk.fullstack.day3;

/**
 * Java Prpgram to demostrate the use of Bitwise operators
 * Bitwise AND =  &
 * Bitwise OR  = |
 * Bitwise XOR  = ^
 * Bitwise Left Shift <<
 * Bitwise Right Shift >>
 */
public class BitWiseOperators {

	public static void main(String[] args) {
		int num1 = 11;  /* 11 = 00001011 */
	    int num2 = 22;  /* 22 = 00010110 */ 
	    int result = 0; /* res= 00011111 */

	     result = num1 & num2;   
	     System.out.println("num1 & num2: "+result); //Output will be 2

	     result = num1 | num2;   
	     System.out.println("num1 | num2: "+result); // Output will be 31
	    
	     result = num1 ^ num2;   
	     System.out.println("num1 ^ num2: "+result);
	    
	     result = ~num1;   
	     System.out.println("~num1: "+result);
	    
	     result = num1 << 2;   
	     System.out.println("num1 << 2: "+result); result = num1 >> 2;   
	     System.out.println("num1 >> 2: "+result);

	}

}
