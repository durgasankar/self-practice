package com.bridgeLabz.spring.springPractise;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//import com.bridgeLabz.spring.dependancyInjection.CI.Student;
import com.bridgeLabz.spring.dependancyInjection.CI.Collection.Project;
import com.bridgeLabz.spring.dependancyInjection.CI.dependentObject.Employee;
import com.bridgeLabz.spring.dependancyInjection.CI.looseCoupling.Student;
import com.bridgeLabz.spring.dependancyInjection.CI.setterInjection.AdvancedStudent;

@SuppressWarnings("deprecation")
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		/**
		 * Constructor injection
		 */

//		Resource resource = new ClassPathResource("CI.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//
//		Student student = (Student) factory.getBean("studentBean");
//
//		student.getDetails();
		/**
		 * CI Dependent object
		 */
//		Resource resource = new ClassPathResource("CIObject.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		Employee employee = (Employee) factory.getBean("employee");
//		employee.show();
		/**
		 * Alternate type
		 */
		
//		Resource resource = new ClassPathResource("CIObject.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		Employee employee = factory.getBean("employee", Employee.class);
//		employee.show();
		
		/**
		 * CI dependent Collection multiple objects
		 */
		
//		Resource resource = new ClassPathResource("CICollectionMultipleInput.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		Project project = factory.getBean("project", Project.class);
//		Project project2 = factory.getBean("project2", Project.class);
//		project.displayEmployeeInfo();
//		project2.displayEmployeeInfo();
		
		/**
		 * Constructor Chaining with collection
		 */
//		Resource resource = new ClassPathResource("CIInhertance.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		Project project = factory.getBean("project1", Project.class);
//		project.displayEmployeeInfoWithOutAddress();
		
		/**
		 * Setter Injection and fetching data
		 */

//		Resource resource = new ClassPathResource("CISetterInjection.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		AdvancedStudent advStudent = factory.getBean("advancedStudent", AdvancedStudent.class);
//		System.out.println(advStudent.toString());
		
		/**
		 * Setter Injection and Loose Coupling
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SILooseCoupling.xml");
		System.out.println("Bean loaded sucessfully");
		Student student = context.getBean("cheat", Student.class);
		student.cheating();
		


	}
}
