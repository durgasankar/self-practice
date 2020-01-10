package com.bridgeLabz.spring.database.Execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeLabz.spring.database.DAO.IContactDAOService;
import com.bridgeLabz.spring.database.model.Contact;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springJDBC.xml");
		System.out.println("Bean loaded successfully");
		IContactDAOService daoService = context.getBean("contactDAO", IContactDAOService.class);
		Contact contact = new Contact();
		contact.setName("Rajaaaa");
		contact.setPhoneNumber("7504147446");
		daoService.save(contact);
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
