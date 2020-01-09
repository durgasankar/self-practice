package com.bridgeLabz.spring.dependancyInjection.Annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Octacore implements Processor {

	public void getProcessor() {
		
		System.out.println("I am using octacore processor");

	}

}
