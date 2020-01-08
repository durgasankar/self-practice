package com.bridgeLabz.spring.dependancyInjection.CI.autoware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * When we have multiple implementation if we want to tell spring particularly
 * Object then we must mention inside {@link Qualifier} annotation specified
 * with class id. Best practice is to use the annotation at the place of
 * Dependency
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-08
 * @version 1.0
 */
public class Human {

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

	public Human() {

	}

	public Human(Heart heart) {

		this.heart = heart;
	}

//	@Autowired
//	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startWorking() {
		if (heart == null)
			System.out.println("Opps Dead!!!");
		heart.pump();
		System.out.println("Animal name : " + heart.getNameOfAnimal() + " heart Number : " + heart.getNoOfHeart());
	}

}
