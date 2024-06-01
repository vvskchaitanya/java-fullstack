package com.vvsk.fullstack.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapExamples {

	public static void main(String[] args) {
		
		
		HashMap<String, String> countryMap = new HashMap<String, String>();
		
		countryMap.put("us", "United States");
		countryMap.put("br", "Brazil");
		countryMap.put("es", "Spain");
		countryMap.put("in", "India");
		
		// Using forEach method using keyset
		for(String key:countryMap.keySet()) {
			System.out.println(key + " - "+ countryMap.get(key));
		}
		
		// Using forEach method using entry set
		for(Entry<String,String> entry: countryMap.entrySet()) {
			System.out.println(entry.getKey() + " - "+ entry.getValue());
		}
		
		System.out.println("=======================================");
		
		LinkedHashMap<String, String> countryMap1 = new LinkedHashMap<String, String>();
		
		countryMap1.put("us", "United States");
		countryMap1.put("br", "Brazil");
		countryMap1.put("es", "Spain");
		countryMap1.put("in", "India");
		
		// Using forEach method using keyset
		for(String key:countryMap1.keySet()) {
			System.out.println(key + " - "+ countryMap1.get(key));
		}
		
		// Using forEach method using entry set
		for(Entry<String,String> entry: countryMap1.entrySet()) {
			System.out.println(entry.getKey() + " - "+ entry.getValue());
		}
		
		
		System.out.println("=======================================");
		
		TreeMap<String, String> countryMap2 = new TreeMap<String, String>();
		
		countryMap2.put("us", "United States");
		countryMap2.put("br", "Brazil");
		countryMap2.put("es", "Spain");
		countryMap2.put("in", "India");
		
		// Using forEach method using keyset
		for(String key:countryMap2.keySet()) {
			System.out.println(key + " - "+ countryMap2.get(key));
		}
		
		// Using forEach method using entry set
		for(Entry<String,String> entry: countryMap2.entrySet()) {
			System.out.println(entry.getKey() + " - "+ entry.getValue());
		}
		
		
		System.out.println("=======================================");
		
		TreeMap<Integer, String> numbers = new TreeMap<Integer, String>();
		
		numbers.put(5,"Five");
		numbers.put(1,"One");
		numbers.put(3,"Three");
		numbers.put(4,"Four");
		numbers.put(2,"Two");
		
		// Using forEach method using keyset
		for(Integer key:numbers.keySet()) {
			System.out.println(key + " - "+ numbers.get(key));
		}
		
		// Using forEach method using entry set
		for(Entry<Integer,String> entry: numbers.entrySet()) {
			System.out.println(entry.getKey() + " - "+ entry.getValue());
		}
		

	}

}
