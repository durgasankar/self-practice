package com.bridgeLabz.spring.applicationContext;

/**
 * Spring example practice fetching data by using constructor
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-07
 * @version 1.8
 */
public class Student {

	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}

}
