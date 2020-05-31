package ArrayList;

import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts;
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}
	//add Contacts if not exist in the array list
	public boolean addNewContact(Contact contact){
		if(findContact(contact.getName()) >= 0) {
			System.out.println("contact is already on the file.");
			return false;
		}
			myContacts.add(contact);
			return true;
	}
	//it will check the index of contact by checking in array list o/p integer
	private int findContact(Contact contact) {
		return this.myContacts.indexOf(contact);
	}
	//it will check the index of contact by checking in array list if matches
	private int findContact(String contactName) {
		for(int i=0; i < this.myContacts.size();i++) {
			Contact contact = this.myContacts.get(i);
			if(contact.getName().contentEquals(contactName)) {
				return i;
			}
		}
		return -1;
	}
	//to update contact
	public boolean updateContact(Contact oldContact, Contact newContact) {
		int foundPosition = findContact(oldContact);//checking whether present or not
		if(foundPosition < 0) {
			System.out.println(oldContact.getName()+" was not found.");
			return false;
		}else if(findContact(newContact.getName()) != -1) {
			System.out.println("contact with name "+newContact.getName()+
								" already exist. Update is not successful!");
			return false;
		}
			//if not present it added to the list
			this.myContacts.set(foundPosition, newContact);
			System.out.println(oldContact.getName()+" was replaced with "+newContact.getName());
			return true;	
	}
	public String queryContact(Contact contact) {
		if(findContact(contact) >=0) {
			return contact.getName();
		}
		return null;
	}
	
	public boolean removeContact(Contact contact) {
		int foundPosition = findContact(contact);
		if(foundPosition < 0) {
			System.out.println(contact.getName()+"was not found.");
			return false;
		}else {
			this.myContacts.remove(foundPosition);
			System.out.println(contact.getName()+" is successfully removed.");
			return true;
		}
	}
	public void printContacts() {
		for(int i=0; i < this.myContacts.size(); i++) {
			System.out.println((i+1)+". "+this.myContacts.get(i).getName()+" -> "+
								this.myContacts.get(i).getPhoneNumber());
		}
	}
	//getting the position number from name
	public Contact queryContact(String name) {
		int position = findContact(name);
		if(position >=0) {
			return this.myContacts.get(position);
		}else {
			return null;
		}
		
	}
	
}
