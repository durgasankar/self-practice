package com.bridgeLabz.java8Features.defaultKeyWord;

public class Hero implements Actor {

	@Override
	public void act() {
		System.out.println("Acting...");
		
	}

	@Override
	public void dance() {
		System.out.println("Dancing...");
		
	}
	@Override
	public void speak() {
		System.out.println("Speaking hero...");
	}

}
