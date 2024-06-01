package com.vvsk.fullstack.streams;

import java.util.Comparator;

public class StudentCGPAComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return  Double.valueOf(o2.getCgpa()).compareTo(Double.valueOf(o1.getCgpa()));
	}

}
