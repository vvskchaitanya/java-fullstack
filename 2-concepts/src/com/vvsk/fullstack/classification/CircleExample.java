package com.vvsk.fullstack.classification;

public class CircleExample {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		
		
		System.out.println("Comparision of reference of objects for c1 and c2 "+ (c1==c2));
		
		System.out.println("Comparision of fields of objects using equals method for c1 and c2 " + c1.equals(c2));
		
		
		

	}

}
