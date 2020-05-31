package com.bridgeLabz.annotation.methodLevel;

import com.bridgeLabz.annotation.classLevel.Student;
import com.bridgeLabz.annotation.methodLevel.Exam.Priority;
import com.bridgeLabz.annotation.methodLevel.Exam.Status;

public class AdvancedStudent extends Student {

	public AdvancedStudent(String sid, String sName, String saddr) {
		super(sid, sName, saddr);
	}
	@Exam(name = "Half yearly",status = Status.STARTED, priority = Priority.MEDIUM)
	@Override
	public void getStudentDetails() {
		System.out.println("Advaned Student Details");
		System.out.println("id : " + getSid());
		System.out.println("name : " + getsName());
		System.out.println("address : " + getSaddr());
	}
	
	

}
