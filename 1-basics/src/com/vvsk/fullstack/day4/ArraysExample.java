package com.vvsk.fullstack.day4;

/**
 * Java Program to demonstrate to declare and access arrays using different datatypes   
 */
public class ArraysExample {

	public static void main(String[] args) {

		int x = 10;
		
		System.out.println(x);
		
		
		// declares an array of integers
        int[] array;

        // allocates memory for 10 integers
        array = new int[10];
           
        // initialize first element
        array[0] = 100;
        // initialize second element
        array[1] = 200;
        // and so forth
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        array[5] = 600;
        array[6] = 700;
        array[7] = 800;
        array[8] = 900;
        array[9] = 1000;

        System.out.println("Element at index 0: "
                           + array[0]);
        System.out.println("Element at index 1: "
                           + array[1]);
        System.out.println("Element at index 2: "
                           + array[2]);
        System.out.println("Element at index 9: "
                           + array[9]);
        
        // Intitalizing Integer array
        
        int[] numbers = {1,2,3,4,5,6};
        
        System.out.println(numbers[0]);
        System.out.println(numbers[5]);
		
        // Intitalizing char array
        
        char[] characters = {'C','H','A','I','T','U'};
        
        
        System.out.println(characters[0]);
        System.out.println(characters[5]);
        
        System.out.println("line 57 "+new String(characters));
        
        // Intitalizing double array
        double[] interestRates= { 10.8,11.8,12.8};
        
        System.out.println(interestRates[0]);
        System.out.println(interestRates[2]);
        
        // Intializing String array
        
        String[] wordsList = {"Hello","World","This","is","string","array"};
        
        System.out.println(wordsList[0]);
        System.out.println(wordsList[5]);
		
	}

}
