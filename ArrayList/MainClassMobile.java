package ArrayList;

import java.util.Scanner;

public class MainClassMobile {
	private static Scanner sc = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("7504147446");
	
	public static void main(String[] args) {
		
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			int action = sc.nextInt();
			switch(action) {
			
			case 0: 
				System.out.println("Shutting down...");
				quit = true;
				break;
			case 1:
				printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			}
		}
	}
	private static void queryContact() {
		System.out.println("Enter existing contact name");
		String name = sc.nextLine();
		Contact existingContactNumber = mobilePhone.queryContact(name);
		if(existingContactNumber == null) {
			System.out.println("Contact not found.");
		}
		System.out.println("Name: "+existingContactNumber.getName()+
							" Number :"+existingContactNumber.getName());
	}
	
	private static void removeContact() {
		sc.nextLine();
		System.out.println("Enter existing contact name");
		String name = sc.nextLine();
		Contact existingContactNumber = mobilePhone.queryContact(name);
		if(existingContactNumber == null) {
			System.out.println("Contact not found.");
		}
		if(mobilePhone.removeContact(existingContactNumber)) {
			System.out.println("Successfully deleted record.");
		}else
			System.out.println("Error deleting record.");
	}
	
	private static void updateContact() {
		sc.nextLine();
		System.out.println("Enter existing contact name : ");
		String name = sc.nextLine();
		Contact existingContactNumber = mobilePhone.queryContact(name);
		if(existingContactNumber == null) {
			System.out.println("Contact not found.");
		}else {
			System.out.print("Enter new Contact name : ");
			String newName = sc.nextLine();
			System.out.print("Enter new Contact number : ");
			String newNumber = sc.nextLine();
			Contact newContact = Contact.createContact(newName, newNumber);
			if(mobilePhone.updateContact(existingContactNumber, newContact)) {
				System.out.println("Successfully updated record.");
			}else
				System.out.println("Error updating record.");
		}
	}
	
	private static void addNewContact() {
		sc.nextLine();
		System.out.println("Enter new contact name");
		String name = sc.nextLine();
		System.out.println("Enter the Phone Number");
		String number = sc.nextLine();
		Contact newContact = Contact.createContact(name, number);
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added : "+name+" phone = "+number);
		}else {
			System.out.println("Cannot add "+name+" already on the list");
		}
	}
	
	private static void printContacts() {
		System.out.println("Contact List :");
		mobilePhone.printContacts();
	}
	
	private static void startPhone() {
		System.out.println("Mobile phone is starting...");
	}
	
	private static void printActions() {
		System.out.println("Available Actions are :");
		System.out.println( "0 -> to shut down\n"+
							"1 -> to print contacts.\n"+
							"2 -> to add a new contact.\n"+
							"3 -> to update existing contact.\n"+
							"4 -> to remove existing contact.\n"+
							"5 -> query if an existing contact exist.\n"+
							"6 -> to print a list of availabe actions.");
		System.out.println("Choose Your Action");
	}
	

}
