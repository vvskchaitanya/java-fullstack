package com.vvsk.fullstack.collections.sorting;

import java.util.Comparator;

public class StudentCGPAComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return  new Double(o2.getCgpa() - o1.getCgpa()).intValue();
	}

}
