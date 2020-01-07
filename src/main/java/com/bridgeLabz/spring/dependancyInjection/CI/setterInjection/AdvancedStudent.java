package com.bridgeLabz.spring.dependancyInjection.CI.setterInjection;

public class AdvancedStudent {

	private String name;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "AdvancedStudent [name=" + name + ", city=" + city + "]";
	}

}
