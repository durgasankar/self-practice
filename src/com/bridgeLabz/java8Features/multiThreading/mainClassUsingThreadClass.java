package com.bridgeLabz.java8Features.multiThreading;

public class mainClassUsingThreadClass {
	public static void main(String[] args) throws InterruptedException {
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		test1.start();
	//	Thread.sleep(10);
		test2.start();
		
	}

}

class Test1 extends Thread {
	@Override
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

class Test2 extends Thread {
	@Override
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
