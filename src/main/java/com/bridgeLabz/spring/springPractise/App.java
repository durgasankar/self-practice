package com.bridgeLabz.spring.springPractise;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgeLabz.spring.applicationContext.Student;

@SuppressWarnings("deprecation")
public class App {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student student = (Student) factory.getBean("studentBean");
		
		student.displayInfo();
		
		
		
		
		
	}
}
