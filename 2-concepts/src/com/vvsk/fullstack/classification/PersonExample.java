package com.fullstack.day8;

public class PersonExample {

	public static void main(String[] args) {
		
		System.out.println("Hello Debugging");
		
		// Creating the new object form class(blueprint) Person
		
		Person p = new Person();
		
		p.name="Sravanthi";
		p.gender='F';
		p.occupation = "Scientist";
		
		System.out.println(p.age);
		System.out.println(p.name);
		
		p.work();
		
		
		/*
		Person p1 = new Person("Chaitanya",40, 'M', "SWE");
		
		Person p2 = new Person("Santosh",30, 'M',"Doctor");
		
		Person p3 = new Person("Jon",30, 'M',"Professor");
		
		
		p1.work();
		
		p2.work();
		
		p3.work();
		
		*/
		
		System.out.println("Program completed");
		

	}

}
