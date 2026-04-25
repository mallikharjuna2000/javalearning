package com.codegnan.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println("Child Thread");
		}
	}

}
