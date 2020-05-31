package com.bridgeLabz.comparableLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparedToInForLoopAndAdvancedForLoop {
	public static void main(String[] args) {
		Student johny = new Student(5, "Jonny");
		Student rahul = new Student(10, "Rahul");
		Student sam = new Student(15, "Sam");
		Student Dharmesh = new Student(12, "Dharmesh");
		Student suresh = new Student(105, "Suresh");
		Student ramesh = new Student(175, "Ramesh");

		List<Student> students = new ArrayList<Student>();
		students.add(johny);
		students.add(rahul);
		students.add(sam);
		students.add(Dharmesh);
		students.add(suresh);
		students.add(ramesh);

		Collections.sort(students, (student1, student2) -> student1.getName().compareTo(student2.getName()));
		/**
		 * advanced for loop
		 */
//		for (Student student : students) {
//			System.out.println(student.getName());
//			System.out.println(student.getId());
//			new Thread(() -> System.out.println(student.getId())).start();
//		}
		/**
		 * for loop implementation
		 */
//		System.out.println("****separator****");
//		for(int i = 0 ; i < students.size(); i++) {
//			Student student = students.get(i);
//			System.out.println(student.getName());
//			new Thread(() -> System.out.println(student.getId())).start();
		/**
		 * for each method to do internal iteration
		 */
		students.forEach(student -> {
			System.out.println(student.getId());
			System.out.println(student.getName());
		});
	}

}
