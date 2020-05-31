package com.bridgeLabz.comparableLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class FilterUsingLambda {

	public static void main(String[] args) {
		Student johny = new Student(5, "Jonny");
		Student rahul = new Student(10, "Rahul");
		Student sam = new Student(15, "Sam");
		Student Dharmesh = new Student(12, "Dharmesh");
		Student suresh = new Student(105, "Suresh");
		Student ramesh = new Student(175, "Ramesh");
		Student rupesh = new Student(7, "Rupesh");
		Student amresh = new Student(75, "Amresh");
		Student rakesh = new Student(27, "Rakesh");

		List<Student> students = new ArrayList<Student>();
		students.add(johny);
		students.add(rahul);
		students.add(sam);
		students.add(Dharmesh);
		students.add(suresh);
		students.add(ramesh);
		students.add(rupesh);
		students.add(amresh);
		students.add(rakesh);

		Collections.sort(students, (student1, student2) -> student1.getName().compareTo(student2.getName()));

//		/**
//		 * printing advanced forLoop
//		 */
//		System.out.println("id above 50");
//		System.out.println("printing by advanced forloop");
//		for (Student student : students) {
//			if (student.getId() > 50) {
//				System.out.println(student.getName());
//			}
//		}

//		/**
//		 * forEach printing
//		 */
//		System.out.println("printing by forEach and if block");
//		students.forEach(student -> {
//			if (student.getId() > 50) {
//				System.out.println(student.getName());
//			}
//		});
		System.out.println("id above 50");
		printStudentById(students, student -> student.getId() > 50);
		System.out.println("id under 50");
		printStudentById(students, student -> student.getId() <= 50);
	}
	/**
	 * 
	 * @param students as a list
	 * @param ageText as String input parameter
	 * @param condition as a Predicate Interface
	 */
	private static void printStudentById(List<Student> students, Predicate<Student> condition) {
		System.out.println("************");
		for (Student student : students) {
			if (condition.test(student)) {
				System.out.println(student.getName());
			}
		}
	}

}
