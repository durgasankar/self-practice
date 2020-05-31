package com.bridgeLabz.java8Features.multiThreading;

public class SynchronizedKey {

	public int count;

	/**
	 * we used synchronized as because when t1 starts his job at the mean while t2
	 * thread works but when multiple actions are done thread got some functionality
	 * may be partiality completed while executing other thread so this keyword help
	 * in conducting the work in a systematic flow without leaving any unused data .
	 */
	public synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {
		SynchronizedKey s = new SynchronizedKey();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					s.increment();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					s.increment();
				}

			}
		});
		// t1 thread starts its execution
		t1.start();
		t2.start();
		// t1 thread waits till the completion of execution of other thread.
	//	t1.join();
	//	t2.join();
		System.out.println("count : " + s.count);

	}

}
