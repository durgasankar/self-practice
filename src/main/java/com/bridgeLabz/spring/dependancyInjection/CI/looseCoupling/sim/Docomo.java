package com.bridgeLabz.spring.dependancyInjection.CI.looseCoupling.sim;

public class Docomo {

	private Service service;

	public void setService(Service service) {
		
		this.service = service;
	}

	public void activateService() {
		
		service.service();
	}

}
