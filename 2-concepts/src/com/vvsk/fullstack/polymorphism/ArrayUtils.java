package com.vvsk.fullstack.polymorphism;


/**
 * ArrayUtils is a Utility for having different search operations to be performed on arrays
 * Polymorphism - Method Overloading - Same Method Name -  Different Paramerters
 */
public class ArrayUtils {
	
	/**
	 * This method is used for searching the given integer in given input integer array
	 * returns the index of input integer in the array
	 * returns -1 if input is not found
	 * @param inputArray
	 * @param searchKey
	 * @return
	 */
	public static int search(int[] inputArray, int searchKey) {

		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]==searchKey) {
				return i;
			}
		}
		return -1;	
	}
	
	
	/**
	 * This method is used for searching the given integer in given input double array
	 * returns the index of input double in the array
	 * returns -1 if input is not found
	 * @param inputArray
	 * @param searchKey
	 * @return
	 */
	public static int search(double[] inputArray, double searchKey) {

		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]==searchKey) {
				return i;
			}
		}
		return -1;	
	}
	
	/**
	 * This method is used for searching the given char in given input char array
	 * @param inputArray
	 * @param searchKey
	 * @return
	 */
	public static int search(char[] inputArray, char searchKey) {
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]==searchKey) {
				return i;
			}
		}
		return -1;	
	}
	

}
