package com.bridgeLabz.spring.dependancyInjection.Annotations;

import org.springframework.beans.factory.annotation.Value;

public class Phone {
	@Value("Note 5 pro")
	private String phoneName;
	@Value("Redmi")
	private String phoneBrand;

	public String getPhoneName() {
		return phoneName;
	}

	public String getPhoneBrand() {
		return phoneBrand;
	}

	public void getPhoneDetails() {
		System.out.println("Hi. Your phone is " + phoneName + " of Company " + phoneBrand);
	}

}
