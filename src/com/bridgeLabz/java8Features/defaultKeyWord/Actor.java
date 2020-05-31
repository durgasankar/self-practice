package com.bridgeLabz.java8Features.defaultKeyWord;

public interface Actor {

	void act();

	void dance();
	
	default void speak() {
		System.out.println("Speaking...");
	}

}
