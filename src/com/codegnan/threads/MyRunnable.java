package com.codegnan.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println("sita Thread");
		}
	}

}
