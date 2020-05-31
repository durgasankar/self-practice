package com.bridgeLabz.annotation.methodLevel;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Exam {
	public enum Status {
		STARTED, COMPLETED
	}

	public enum Priority {
		LOW, MEDIUM, HIGH
	}

	String name() default "Unit test";

	Status status() default Status.STARTED;

	Priority priority() default Priority.LOW;

}
