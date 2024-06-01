package com.fullstack.day8;

public class Person {
	
	// Every class is for sure child class of Object
	
	// fields -  Determine current state of the class - member variables / instance variables
	String name;
	
	int age;
	
	char gender;
	
	String occupation;
	
	// constructor 
	// - its also a method 
	// - doesn't have return type 
	// - used to create new instance of class 
	//- used for instantiating state of object
	// Java provides by default empty constructor for all objects
	/*
	
	// this keyword - current object instance - instance variables
	public Person(String n, int a, char g, String o) {
		this.name = n;
		this.age = a;
		this.gender = g;
		this.occupation = o;
	}
	*/
	
	
	// methods
	public void work() {
		System.out.println("Person " + name + " works as "+occupation);
	}
	
	
	
}
