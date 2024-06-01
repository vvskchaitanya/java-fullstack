package com.vvsk.fullstack.collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> evenNumbers1 = new LinkedHashSet<>();

        // Using the add() method
		evenNumbers1.add(8);
		evenNumbers1.add(6);
		evenNumbers1.add(4);
		evenNumbers1.add(2);
        System.out.println("HashSet: " + evenNumbers1);
		
		TreeSet<Integer> evenNumbers = new TreeSet<>();

        // Using the add() method
        evenNumbers.add(8);
        evenNumbers.add(6);
        evenNumbers.add(4);
        evenNumbers.add(2);
        System.out.println("TreeSet: " + evenNumbers);

        
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        
        System.out.println("New TreeSet: " + numbers);

        // Using the addAll() method
        numbers.addAll(evenNumbers);
        System.out.println("New TreeSet: " + numbers);
        
        Iterator<Integer> normalIterator = numbers.iterator();
        
        while(normalIterator.hasNext()) {
        	Integer number = normalIterator.next();
        	System.out.print(number);
            System.out.print(", ");
        }
        
        Iterator<Integer> specialIterator = numbers.descendingIterator();
        
        while(specialIterator.hasNext()) {
        	Integer number = specialIterator.next();
        	System.out.print(number);
            System.out.print(", ");
        }
        
        

	}

}
