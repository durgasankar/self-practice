package com.bridgeLabz.spring.springPractise;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgeLabz.spring.dependancyInjection.Annotations.Config;
import com.bridgeLabz.spring.dependancyInjection.Annotations.Phone;
//import com.bridgeLabz.spring.dependancyInjection.CI.Student;
import com.bridgeLabz.spring.dependancyInjection.CI.Collection.Project;
import com.bridgeLabz.spring.dependancyInjection.CI.autoware.Human;
import com.bridgeLabz.spring.dependancyInjection.CI.dependentObject.Employee;
//import com.bridgeLabz.spring.dependancyInjection.CI.looseCoupling.Student;
import com.bridgeLabz.spring.dependancyInjection.CI.looseCoupling.sim.Docomo;
import com.bridgeLabz.spring.dependancyInjection.CI.properties.Student;
import com.bridgeLabz.spring.dependancyInjection.CI.setterInjection.AdvancedStudent;

@SuppressWarnings({ "deprecation", "unused", "resource" })
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

//		ApplicationContext context = new ClassPathXmlApplicationContext("SILooseCoupling.xml");
//		System.out.println("Bean loaded successfully");
//		Student student = context.getBean("cheat", Student.class);
//		student.cheating();

		/**
		 * Setter Injection and loose coupling with example of SimCard
		 */

//		ApplicationContext context = new ClassPathXmlApplicationContext("SILooseCouplingSim.xml");
//		System.out.println("Sim Bean looded Successfully");
//		Docomo docomoSim = context.getBean("docomoSim", Docomo.class);
//		docomoSim.activateService();

		/**
		 * Autowired and qualifier annotations
		 */

//		ApplicationContext context = new ClassPathXmlApplicationContext("SIAutoware.xml");
//		System.out.println("Bean file loaded successfully");
//		Human human = context.getBean("human", Human.class);
//		human.startWorking();

		/**
		 * Fetching data from properties file extension and use of annotations to put
		 * value
		 */

//		ApplicationContext context = new ClassPathXmlApplicationContext("CIProperties.xml");
//		System.out.println("Bean file loaded successfully!");
//		Student student = context.getBean("student", Student.class);
//		student.displayStudentInfo();

		/**
		 * Here as we using annotations first we load applicationContext interface
		 * implemented class. as to avoid creating xml we need to create a Configuration
		 * Class where all class configurations will be present
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("Bean file loaded sucessfully");
		Phone phone = context.getBean(Phone.class);
		phone.getPhoneDetails();

	}
}
