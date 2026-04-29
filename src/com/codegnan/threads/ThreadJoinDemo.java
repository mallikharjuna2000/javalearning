package com.codegnan.threads;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Rama Thread");
		}

	}

}
