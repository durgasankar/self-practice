package com.bridgeLabz.spring.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.bridgeLabz.spring.AOP.Model.Circle;

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
//	@Before("execution(public String com.bridgeLabz.spring.AOP.Model.Circle.getName())")
//	public void loggingAdvice() {
//		System.out.println("Advice is run... get method is called...");
//	}
	/**
	 * JoinPoint we can mention as input parameter where it has some
	 * predefined functions one most used function is getTargetPoint()
	 * best use is it returns the object address we can fetch the object 
	 * from that and we can check accordingly.
	 * 
	 * @param joinPoint as input parameter
	 */
	@Before("allCircleMethod()")
	public void secondAfterAdvice(JoinPoint joinPoint) {
//		System.out.println("second after advice...");
		System.out.println(joinPoint.getTarget());
		Circle circle = (Circle) joinPoint.getTarget();
		System.out.println(circle.getName());
		
	}
	
//	@Before("allGetters()")
//	public void secondBeforeAdvice() {
//		System.out.println("second before advice...");
//	}
	/**
	 * avoid writing execution pattern many times we can mention that on a empty
	 *  Method we can mention on top of that with @pointCut annotation name which 
	 *  will refer to that.  
	 */
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	/**
	 * point cut for all methods of circle class
	 * 
	 * But it is best practice for readable purpose we should use 
	 * @Pointcut("within(com.bridgeLabz.spring.AOP.Model.Circle)")
	 */
	@Pointcut("within(com.bridgeLabz.spring.AOP.Model.Circle)")
	public void allCircleMethod() {}
	
	/**
	 * we can use operators with logical && and ||
	 */
	
//	@Before("allCircleMethod() && allGetters()")
//	public void allCircleMethodAndAllGettres() {
//		System.out.println("all Circle Method And All Gettres...");
//	}
	
	/**
	 * point cut for all method takes String as input parameter.
	 */
	@Pointcut("args(String)")
	public void allStringArguments() {}
	
	
	@Before("allStringArguments()")
	public void StringArguments() {
		System.out.println("Method takes String arguments are called");
	}
	
	//@After -> it will execute if that method is executed.
	//@AfterReturning -> it will execute after  successfully execution of that method
	//@AfterThrowing -> it will work after an exception is thrown. it works like finally block.
	
	/**
	 * match this point cut exception and fetch the input parameter and also fetch
	 * 
	 * the returning parameter
	 */
	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void StringArgumentMethods(String name, String returnString) {
		System.out.println("Method takes String argument is called  value : " + name + " Out put value : " + returnString);
	}
	
	/**
	 * it must take one parameter atLeast
	 * we have more control 
	 * we can mention before code and after code.
	 * Additional feature we can get any return value if there.
	 * 
	 * @param joinPoint
	 * @throws Throwable 
	 */
	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnValue = null;
		try {
			//execute some code
			System.out.println("Before advice.............");
			proceedingJoinPoint.proceed();
			
			//execute some code
			System.out.println("after returning.............");
		} catch (Throwable e) {
			System.out.println("After Throwing.............");
		}
		
		System.out.println("After finally");
		return returnValue;
		
		
	}

}
