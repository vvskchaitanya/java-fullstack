package com.vvsk.fullstack.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using Arrays for int, double, char
		
		int[] intArray = new int[10];
		
		double[] doubleArray = new double[10];
		
		char[] charArray = new char[10];
		
		String[] stringArray = new String[10];
		
		// Using Collections -> list for int, double, char
		
		// intialize ArrayList of integer type - we need to use generic Integer class
		ArrayList<Integer> intCollection =  new ArrayList<Integer>();
		
		// intialize ArrayList of double type - we need to use generic Double class
		ArrayList<Double> doubleCollection =  new ArrayList<Double>();
		
		// intialize ArrayList of char type - we need to use generic Character class
		ArrayList<Character> charCollection =  new ArrayList<Character>();
		
		ArrayList<String> stringCollection =  new ArrayList<String>();
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<Integer, Double> map2 = new HashMap<Integer, Double>();
	
	}

}
