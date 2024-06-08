package com.vvsk.fullstack.checked;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrate program to trigger IOException using File and Scanner
 */
public class IOExceptionExample {

	public static void main(String[] args) {
		
		String fileName = "C:\\Users\\lenovo\\Desktop\\fullstack-examples\\MyTextFile3.txt";
		
		File file = new File(fileName);
		
		try {
			
			Scanner sc = new Scanner(file);
			
			System.out.println("Hurray!!, I have found the file "+fileName);

			sc.close();
			
		} catch (IOException e) {
			System.out.println("Cannot find file "+fileName);
			e.printStackTrace();
		}
		

	}

}
