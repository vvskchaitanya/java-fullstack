package com.vvsk.fullstack.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class College {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Balu",1,20,'C',9.8));
		students.add(new Student("Ajay",2,23,'B',6.5));
		students.add(new Student("Chaitanya",3,22,'A',8.0));
		
		// using forEach
		for(Student std: students) {
			System.out.println(std);
		}
		
		System.out.println("==========================");
		System.out.println("Sorting using age");
		
		// Sort will use compareTo method of Student to determine sorting order
		Collections.sort(students);
		
		// using forEach
		for(Student std: students) {
			System.out.println(std);
		}
		
		// Sort using Comparator
		Collections.sort(students,new StudentNameComparator());
		
		System.out.println("==========================");
		
		System.out.println("Sorting using name");
		
		// using forEach
		for(Student std: students) {
			System.out.println(std);
		}
		
		// Sort using Comparator
		Collections.sort(students,new StudentGradeComparator());
		
		System.out.println("==========================");
		
		System.out.println("Sorting using grade");
		
		// using forEach
		for(Student std: students) {
			System.out.println(std);
		}
		
		// Sort using Comparator
		Collections.sort(students,new StudentCGPAComparator());
		
		System.out.println("==========================");
		
		System.out.println("Sorting using cgpa");
		
		// using forEach
		for(Student std: students) {
			System.out.println(std);
		}

	}

}
