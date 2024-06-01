package com.vvsk.fullstack.day3;

/**
 * Demonstrate program to use Terinary Operator 
 * Condition check ? statements for true : statements for false
 */
public class TerinaryOperator {

	public static void main(String[] args) {
		int num1, num2;
        num1 = 25;

        /* num1 is not equal to 10 that's why
		 * the second value after colon is assigned
		 * to the variable num2
		 */
		num2 = (num1 == 10) ? 100: 200;
		System.out.println( "num2: "+num2);
		
		/* num1 is equal to 25 that's why
		 * the first value is assigned
		 * to the variable num2
		 */
		num2 = (num1 == 25) ? 100: 200;
		System.out.println( "num2: "+num2);

	}

}
