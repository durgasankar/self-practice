package com.bridgeLabz.annotation.methodLevel;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.bridgeLabz.annotation.classLevel.Student;

public class Implementation {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Student advancedStudent = new AdvancedStudent("H007", "Hari", "Uganda");

		advancedStudent.getStudentDetails();

		Class clz = advancedStudent.getClass();
		Method mtd = clz.getDeclaredMethod("getStudentDetails");
		Annotation assignedAnnotation = mtd.getAnnotation(Exam.class);
		Exam studentExam = (Exam) assignedAnnotation;

		System.out.println("Exam name : " + studentExam.name());
		System.out.println("Exam status : " + studentExam.status());
		System.out.println("Exam priority : " + studentExam.priority());
	}

}
