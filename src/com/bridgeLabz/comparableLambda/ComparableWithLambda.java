package com.bridgeLabz.comparableLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableWithLambda {
	public static void main(String[] args) {
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
		 * Using lambda expression Collections.sort (list,( @param1 p1, @param2 p2) ->
		 * p1.get(comparing basis).compareTo(p1.get(comparing basis)));
		 */
		Collections.sort(students,
				(Student student1, Student student2) -> student1.getName().compareTo(student2.getName()));
		/**
		 * Removing the variable dataType.
		 */
		Collections.sort(students, (student1, student2) -> student1.getName().compareTo(student2.getName()));

		for (Student student : students) {
			System.out.println(student.getName());
		}
	}

}
