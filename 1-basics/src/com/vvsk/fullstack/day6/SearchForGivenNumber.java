package com.vvsk.fullstack.day6;

import java.util.Scanner;


/**
 * Java Program for search given number in the input array
 */
public class SearchForGivenNumber {

	public static void main(String[] args) {
		
		int[] numbers= {10,15,20,25,30};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any integer for searching: ");
		int x = scanner.nextInt();
		
		// Initially assuming element is not found in array
		boolean found = false;
		
		for(int i:numbers) {
			if(i==x) {
				found= true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Given Integer is present in the array");
		}else {
			System.out.println("Integer not found");
		}
		
		
		scanner.close();
		
	}

}
