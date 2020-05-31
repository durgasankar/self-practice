package com.bridgeLabz.java8Features.multiThreading;

public class MainClassUsingInterface {

	public static void main(String[] args) throws InterruptedException {
		// class created
		Runnable obj1 = new Test3();
		Runnable obj2 = new Test4();

		// thread created and assigning values to thread.
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		// calling start method of thread class.
		t1.start();
		Thread.sleep(10);
		t2.start();

	}

}

class Test3 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Messages.getString("MainClassUsingInterface.0")); //$NON-NLS-1$
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Test4 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Messages.getString("MainClassUsingInterface.1")); //$NON-NLS-1$
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
