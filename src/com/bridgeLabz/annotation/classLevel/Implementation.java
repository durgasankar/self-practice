package com.bridgeLabz.annotation.classLevel;

import java.lang.annotation.Annotation;

public class Implementation {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Student newStudent = new Student("D45", "Ramesh", "Karachi");
		newStudent.getStudentDetails();
		Class clz = newStudent.getClass();
		Annotation anotation = clz.getAnnotation(Course.class);
		Course corse = (Course) anotation;
		System.out.println("Student course details");
		System.out.println("Course id : " + corse.cId());
		System.out.println("Course name : " + corse.cName());
		System.out.println("Course Cost : " + corse.cCost());

	}

}
