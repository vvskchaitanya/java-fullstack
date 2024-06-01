package com.vvsk.fullstack.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Balu",1,20,'C',9.8));
		students.add(new Student("Ajay",2,23,'B',6.5));
		students.add(new Student("Chaitanya",3,22,'A',8.0));
		students.add(new Student("Deva",4,25,'A',7.9));
		students.add(new Student("Eve",5,25,'B',8.5));
		
		// using forEach
		for(Student std: students) {
			System.out.println(std);
		}
		
		// To get names of students who got cgpa greater than or equal to 8.0 and in order of cgpa
		
		// lambda expression and functional interfaces
		
		List<String> names = students.stream()
				.filter(student -> { return student.getCgpa()>=8.0; })
				.sorted(new StudentCGPAComparator())
				.map(Student::getName)
				.collect(Collectors.toList());
		
		System.out.println(names);
		
		

	}

}
