package com.bridgeLabz.java8Features.multiThreading;

public class MainClassUsingLamdaExpression {

}

class Test5 implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Test1...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Test6 implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Test2...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
