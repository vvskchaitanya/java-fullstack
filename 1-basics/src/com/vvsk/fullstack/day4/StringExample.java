package com.vvvsk.fullstack.day4;

/**
 * java program to demonstrate the String DataType
 */

public class StringExample {

	public static void main(String[] args) {
		// Create String using string-literal and print in console output
		
		String greeting = "Hello World";
		String secondString = " This is program for String Datatype";
		
		//System.out.println(greeting);
		
		System.out.println(greeting+secondString);
		
		
		// Create String using object and print in console output
		
		String stringObject = new String("Hello World");
		
		System.out.println(stringObject+ " Welcome "+secondString);


		
		// Using split method to split the string
		
		String split1 = greeting.split(" ")[0];
		String split2 = greeting.split(" ")[1];
		
		
		System.out.println(split1);
		System.out.println(split2);
		
		// Program 2 to split the String
		
		String myString = "Apple,Banana,Orange,Watermelon";
		
		System.out.println(myString.split(",")[0]);
		System.out.println(myString.split(",")[1]);
		System.out.println(myString.split(",")[2]);
		System.out.println(myString.split(",")[3]);
		
		// indexOf method
		
		System.out.println(myString.indexOf("Banana"));
		
		System.out.println(myString.toLowerCase().indexOf("banana"));
		
		// What does this return? -1 = Not Found
		System.out.println(myString.indexOf("Chaitanya"));
		
		// Lower Case and Upper Case methods of String
		
		String example = "ABC abc - DEF def";
		
		System.out.println(example);
		
		System.out.println(example.toLowerCase());
		
		System.out.println(example.toUpperCase());
		
		System.out.println(example.length());
		
		// substring method inside string
		
		System.out.println(example.substring(4));
		
		System.out.println(example.substring(4,7));
		
		String example2 = "banana";
		
		System.out.println(example2.substring(0,3));

	}

}
