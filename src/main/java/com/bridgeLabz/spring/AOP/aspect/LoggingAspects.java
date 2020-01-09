package com.bridgeLabz.spring.AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * We converted this class to a Aspect class inside this class we can make so
 * many methods and on to of each method we can define our aspect by annotating
 * it with annotations so that we can instruct the controller to run as per
 * given instruction
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-09
 * @version 1.8
 */
@Aspect
public class LoggingAspects {
	@Before("execution(public String getName())")
	public void loggingAdvice() {
		System.out.println("Advice is run... get method is called...");
	}

}
