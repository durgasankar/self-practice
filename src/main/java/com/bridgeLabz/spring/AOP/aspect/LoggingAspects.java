package com.bridgeLabz.spring.AOP.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * We converted this class to a Aspect class inside this class we can make so
 * many methods and on to of each method we can define our aspect by annotating
 * it with annotations so that we can instruct the controller to run as per
 * given instruction . most important we need to mention fully qualified method
 * name with class definition.
 * 
 * 
 * ## we can follow wildCard  is * 
 * it means no matter which method it will word for all name starts with * 
 * we can apply example
 * @Before("execution(public * get*())")
 * it will work for all method starts with get_--- may be any name after get 
 * and irrespective of return type it will work for all.
 * 
 * @Before("execution(public * get*(..))")
 * (..)it means it may be no argument or any argument.this wild card work for all.
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-09
 * @version 1.8
 */
@Aspect
public class LoggingAspects {
	@Before("execution(public String com.bridgeLabz.spring.AOP.Model.Circle.getName())")
	public void loggingAdvice() {
		System.out.println("Advice is run... get method is called...");
	}
	
	@After("allGetters()")
	public void secondAfterAdvice() {
		System.out.println("second after advice...");
	}
	
	@Before("allGetters()")
	public void secondBeforeAdvice() {
		System.out.println("second before advice...");
	}
	/**
	 * avoid writing execution pattern many times we can mention that on a empty
	 *  Method we can mention on top of that with @pointCut annotation name which 
	 *  will refer to that.  
	 */
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	

}
