package com.bridgeLabz.comparableLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableWithOutLambda {
	public static void main(String[] args) {
		// to write multiple lines inside lambda we need to follow (()->{});
		new Thread(() -> {
			System.out.println("inside runnable");
			System.out.println("line 2");
			System.out.println("test");
		}).start();

		Student johny = new Student(5, "Jonny");
		Student rahul = new Student(10, "Rahul");
		Student sam = new Student(15, "Sam");
		Student Dharmesh = new Student(15, "Dharmesh");
		Student suresh = new Student(15, "Suresh");
		Student ramesh = new Student(15, "Ramesh");

		List<Student> students = new ArrayList<Student>();
		students.add(johny);
		students.add(rahul);
		students.add(sam);
		students.add(Dharmesh);
		students.add(suresh);
		students.add(ramesh);
		/**
		 * Using collections.sort it receives 2 @param 1-> list 2-> Comparable type
		 * Declared comparable type as Generic type and on return statement comparable
		 * type as it is @FunctionalInterface one overridden method compare.
		 */
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {

				return student1.getName().compareTo(student2.getName());
			}
		});

		for (Student student : students) {
			System.out.println(student.getName());
		}
	}

}
