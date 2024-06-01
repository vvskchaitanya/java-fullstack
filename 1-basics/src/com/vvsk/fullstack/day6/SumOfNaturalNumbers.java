package com.vvsk.fullstack.day6;

import java.util.Scanner;

/**
 * Java Program to calculate the sum of natural number
 */
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		
		int x = sc.nextInt();
		int i = 1;
		int sumWhile = 0;
		int sumFor = 0;
		
		while(i<=x) {
			sumWhile+=i;
			i++;
		}
		
		System.out.println("Sum of first "+x+" numbers is "+sumWhile);
		
		for(int j=1;j<=x;j++) {
			sumFor+=j;
		}
		
		System.out.println("Sum of first "+x+" numbers is "+sumFor);
		
		
		sc.close();

	}

}
