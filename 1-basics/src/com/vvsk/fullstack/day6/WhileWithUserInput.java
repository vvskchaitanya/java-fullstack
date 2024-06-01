package com.vvsk.fullstack.day6;

import java.util.Scanner;

public class WhileWithUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "Yes";
		
		do {
			System.out.println("Enter \"quit\" to exit the loop");
			
			input =  sc.next();
			
		}while(!input.equals("quit"));
		
		System.out.println("Thanks for Terminating the program");
		
		sc.close();

	}

}
