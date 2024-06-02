package com.vvsk.fullstack.sorting;

public class Student implements Comparable<Student>{
	
	private String name;
	
	private int rollnuber;
	
	private int age;
	
	private char grade;
	
	private double cgpa;

	

	public Student(String name, int rollnuber, int age, char grade, double cgpa) {
		super();
		this.name = name;
		this.rollnuber = rollnuber;
		this.age = age;
		this.grade = grade;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollnuber() {
		return rollnuber;
	}

	public void setRollnuber(int rollnuber) {
		this.rollnuber = rollnuber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnuber=" + rollnuber + ", age=" + age + ", grade=" + grade + ", cgpa="
				+ cgpa + "]";
	}

	// compareTo should return 0 when current object is equal to comparing object
	// compareTo should return -ve when current object is less than comparing object
	// compareTo should return +ve when current object is greater than comparing object
	@Override
	public int compareTo(Student o) {
		return this.age - o.getAge();
	}
	
	

}
