package com.bridgeLabz.spring.database.Execution;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeLabz.spring.database.DAO.IContactDAOService;
import com.bridgeLabz.spring.database.model.Contact;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springJDBC.xml");
		System.out.println("Bean loaded successfully");
		IContactDAOService daoService = context.getBean("contactDAO", IContactDAOService.class);
//		Contact contact = new Contact();
//		contact.setName("Ramesh");
//		contact.setPhoneNumber("7504147446");
//		daoService.save(contact);
//		contact.setName("raja");
//		contact.setPhoneNumber("1234567890");
//		daoService.update(contact);
		ArrayList<Contact> allRecord = (ArrayList<Contact>) daoService.getAll();
		for(int i=0; i < allRecord.size(); i++) {
			System.out.println(allRecord.get(i).getName());
			System.out.println(allRecord.get(i).getPhoneNumber());
		}
		
		((ClassPathXmlApplicationContext) context).close();
		
	
	
	
	}

}
