package com.fullstack.day8;

public class Circle {
	// fields
	int radius;
	
	// constructors
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// methods
	public double area() {
		return (Math.PI * this.radius * this.radius);
	}
	
	public double circumference() {
		return (2* Math.PI * this.radius);
	}
	
	public boolean equals(Circle c) {
		return this.radius == c.radius;
	}

}
