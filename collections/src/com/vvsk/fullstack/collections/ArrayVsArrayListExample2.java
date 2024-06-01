package com.vvsk.fullstack.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Program to demostrate the difference in usage of Array and ArrayList
 */
public class ArrayVsArrayListExample2 {

	public static void main(String[] args) {
		
		// Arrays with primitive data types int, double, char
		// Declaration to specify size of array (for memry allocation)
		int[] intArray = new int[10];
		// Array Initialization
		intArray = new int[]{1,2,3,4,5,6,7,8,9,10};


		char[] charArray = new char[6];
		charArray = new char[]{'q','w','e','r','t','y'};

		
		double[] doubleArray = new double[]{1.2,2.3,3.4};
		
		String[] stringArray = new String[]{"Hello","Hi","Namaste"};

		
		// Using Lists -> ArrayList and Generic Type for int, double, char
		
		// intialize ArrayList of integer type - we need to use generic Integer class
		List<Integer> intList =  new ArrayList<Integer>();
		intList = List.of(1,2,3,4,5,6,7,8,9,10);

		// intialize ArrayList of char type - we need to use generic Character class
		List<Character> charList =  new ArrayList<Character>();
		charList = List.of('q','w','e','r','t','y');
		
		// intialize ArrayList of double type - we need to use generic Double class
		List<Double> doubleList =  List.of(1.2,2.3,3.4);
		
		List<String> stringList =  List.of("Hello","Hi","Namaste");
		
		System.out.println("int[] = "+intArray);
		System.out.println("List<Integer> = "+intList);

		System.out.println("char[] = "+charArray);
		System.out.println("List<Character> = "+charList);

		System.out.println("char[] = "+doubleArray);
		System.out.println("List<Character> = "+doubleList);

		System.out.println("char[] = "+stringArray);
		System.out.println("List<Character> = "+stringList);
	
	}

}
