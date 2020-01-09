package com.bridgeLabz.spring.dependancyInjection.Annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuadCore implements Processor {

	public void getProcessor() {
		
		System.out.println("I am using quardcore processor");

	}

}
