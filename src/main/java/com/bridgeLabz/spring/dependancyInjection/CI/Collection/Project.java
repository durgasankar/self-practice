package com.bridgeLabz.spring.dependancyInjection.CI.Collection;

import java.util.Iterator;
import java.util.List;

import com.bridgeLabz.spring.dependancyInjection.CI.dependentObject.Employee;

/**
 * Spring example practice fetching data by using constructor and also from list
 * Dependent Object
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-07
 * @version 1.8
 */
public class Project {
	private Employee employee;
	private List<String> projects;

	public Project(Employee employee, List<String> projects) {
		this.employee = employee;
		this.projects = projects;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public void displayEmployeeInfo() {
		System.out.println("Employee Information : ");
		System.out.println(employee.toString());

		Iterator<String> iterator = projects.iterator();
		int count = 1;
		System.out.println("Language Information: ");
		while (iterator.hasNext()) {
			System.out.println(count++ + ". " + iterator.next());
		}
	}

}
