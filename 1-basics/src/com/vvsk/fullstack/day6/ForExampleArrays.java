package com.vvsk.fullstack.day6;


/**
 * Java Program for For loop
 */
public class ForExampleArrays {

	public static void main(String[] args) {
		
		// Program for FOR loop using arrays
		
		String[] words = {"Hello","World","This","is","for","loop","New Element"};
		
		
		// Iterating using index and length of array
		for(int i=0;i<=words.length-1;i++) {
			System.out.println("Word at index "+i+" is "+words[i]);
		}
		
		
		// Directly iterate through elements of array
		for(String word:words) {
			System.out.println(word);
		}

	}

}
