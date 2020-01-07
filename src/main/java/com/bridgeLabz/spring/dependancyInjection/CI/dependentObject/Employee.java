package com.bridgeLabz.spring.dependancyInjection.CI.dependentObject;

/**
 * Spring example practice fetching data by using constructor also with CI
 * Dependent Object
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-07
 * @version 1.8
 */
public class Employee {
	private String id;
	private String name;
	private Address address;

	public Employee(String id, String name, Address address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee(String id, String name) {

		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {

		return "ID : " + id + ", name : " + name + " ," + address.toString();
	}

	public String display() {

		return "ID : " + id + ", name : " + name;
	}

	public void show() {
		System.out.println("ID : " + id + ", name : " + name);
		System.out.println(address.toString());
	}

}
