package com.bridgeLabz.spring.dependancyInjection.CI;

/**
 * Spring example Constructor Injection
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

	public void getDetails() {
		System.out.println("Hy " + name);
	}

}
