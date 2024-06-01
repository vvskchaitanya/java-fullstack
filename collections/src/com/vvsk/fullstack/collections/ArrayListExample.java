package com.vvsk.fullstack.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// intialize ArrayList of string type
		
		ArrayList<String> collections =  new ArrayList<String>();
		
		
		// Adding elements into ArrayList using add method
		collections.add("List");
		collections.add("Set");
		collections.add("Map");
		
		collections.add("ArrayList");
		
		collections.add("HashSet");
		
		collections.add("HashMap");
		
		System.out.println("Java Collections : "+collections);
		
		// Size of collection using size()
		
		System.out.println("Collections Size : "+collections.size());
		
		// Accessing elements using get method
		
		System.out.println("First Element is : "+collections.get(0));
		
		System.out.println("Second Element is : "+collections.get(1));
		
		// Adding first element to MyList
		
		collections.add(3, "MyList");
		System.out.println("Java Collections : "+collections);
		
		// Changing first element from MyList to YourList
		
		collections.set(0, "YourList");
		
		System.out.println("Java Collections : "+collections);
		
		// Removing element 
		
		collections.remove(0);
		
		System.out.println("Java Collections : "+collections);
		
		// Removing element 
		
		collections.remove(0);
		
		System.out.println("Java Collections : "+collections);
				
		// Removing element 
		
		collections.remove(0);
		
		System.out.println("Java Collections : "+collections);
		
		

	}

}
