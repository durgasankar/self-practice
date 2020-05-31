package com.bridgeLabz.java8Features.defaultKeyWord;

public class MainClass {
	public static void main(String[] args) {
		Actor hero = new Hero();
		Actor vln = new Vln();
		
		
		hero.act();
		hero.dance();
		/**
		 * it will fetch from the class where it is defined
		 */
		hero.speak();

		vln.act();
		vln.dance();
		
		/**
		 * This will fetch from defined interface.
		 */
		vln.speak();
	}

}
