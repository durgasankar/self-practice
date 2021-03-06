package com.bridgeLabz.spring.dependancyInjection.Annotations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Here as we using annotations first we load applicationContext interface
 * implemented class. as to avoid creating xml we need to create a Configuration
 * Class where all class configurations will be present
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-08
 * @version 1.0
 */
@Configuration
@ComponentScan("com.bridgeLabz.spring.dependancyInjection.Annotations")
@PropertySource("classpath:mobile-info.properties")
public class Config {

//	@Bean
//	public Phone getPhone() {
//		return new Phone();
//
//	}
//
//	@Bean
//	public Processor getProcessor() {
//		return new Octacore();
//	}
	
	

}
