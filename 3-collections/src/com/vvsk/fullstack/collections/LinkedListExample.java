package com.vvsk.fullstack.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		// create Integer type linked list
		LinkedList<Integer>  numbers = new LinkedList<Integer>();
		
		// Add Elements to linked list
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		
		System.out.println("Integer Linkedlist : "+ numbers);
		
		
		
		

		// create String type linked list
		LinkedList<String> animals = new LinkedList<>();
		
		// Add elements to LinkedList
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    System.out.println("String LinkedList: " + animals);
	    
	    
	    
	    // get the element from the linked list
	    String str = animals.get(1);
	    System.out.println("Element at index 1: " + str);
	    
	    // change elements at index 1
	    animals.set(2, "Goat");
	    System.out.println("Updated LinkedList: " + animals);
	    
	    
	    // Using forEach loop
        System.out.println("Accessing linked list elements usign forEach loop:");
        for(String animal: animals) {
            System.out.print(animal);
            System.out.print(", ");
        }
        
      
        
        // Using Collections iterator
        Iterator<String> iterator = animals.iterator();
        System.out.println("\n Accessing linked list elements:");
        while(iterator.hasNext()) {
        	String animal = iterator.next();
        	System.out.print(animal);
            System.out.print(", ");
        }
        
        
        // Using contains method
        System.out.println("Does animals linked list contains \"Cat\" : "+animals.contains("Cat"));
        System.out.println("Does animals linked list contains \"Lion\" : "+animals.contains("Lion"));
        
        
        LinkedList<Integer> temp = new LinkedList<Integer>(List.of(1,2,3,4,5));
        
        System.out.println("Does temp contains 5 "+temp.contains(5));
        
        // Using indexOf method
        System.out.println("Index of \"Dog\" : "+animals.indexOf("Dog"));
        System.out.println("Index of \"Cat\" : "+animals.indexOf("Cat"));
        System.out.println("Index of \"Cow\" : "+animals.indexOf("Cow"));
        System.out.println("Index of \"Goat\" : "+animals.indexOf("Goat"));
        
        
        // using remove method
        animals.remove();
        System.out.println("Updated list:"+ animals);
        

	}

}
