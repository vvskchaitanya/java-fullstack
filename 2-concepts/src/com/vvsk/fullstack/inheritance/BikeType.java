package com.vvsk.fullstack.inheritance;

public enum BikeType {
	
	STANDARD,
	SPORTS;
	
	
	public static BikeType getType(String value) {
		return value.equals("STANDARD") || value.equals("SPORTS")? BikeType.valueOf(value) : BikeType.STANDARD;
	}
	
	
	
	

}
