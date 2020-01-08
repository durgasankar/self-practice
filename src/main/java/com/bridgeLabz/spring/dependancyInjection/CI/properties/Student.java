package com.bridgeLabz.spring.dependancyInjection.CI.properties;

import org.springframework.beans.factory.annotation.Value;

/**
 * Best practice is to declare @Value("${Student.name}") on the top of setter
 * method we can write as @Required. Best practice is done here by this we can
 * avoid setter methods
 * 
 * Best practise is 
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-08
 * @version 1.8
 */

public class Student {
	@Value("${Student.name}")
	private String name;
	@Value("${Student.course}")
	private String course;

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public void displayStudentInfo() {
		System.out.println("Mr/s. " + name + " registered for : " + course + " course.");
	}

}
