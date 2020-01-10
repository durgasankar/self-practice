package com.bridgeLabz.spring.dependancyInjection.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * This class has the functionality that we can use beans to create object or we
 * can follow @Component and @ComponentScan(package path) so that we can avoid
 * creating beans . when we are using Component annotations it creates object
 * for us and in componentScan we declare the path so that we can get the object
 * . we can follow this when we have multiple Implementations to specify one
 * implementation we can write it as @Primary which specifies that it will pick
 * up the primary mentioned object.
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-09
 * @version 1.0
 */
@Component
public class Phone {
	@Value("${Phone.phoneName}")
	private String phoneName;
	@Value("${Phone.phoneBrand}")
	private String phoneBrand;
	@Autowired
	private Processor processor;

	public String getPhoneName() {
		return phoneName;
	}

	public String getPhoneBrand() {
		return phoneBrand;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void getPhoneDetails() {
		System.out.println("Hi. Your phone is " + phoneName + " of Company " + phoneBrand);
		processor.getProcessor();
	}

}
