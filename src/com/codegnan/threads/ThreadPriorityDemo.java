package com.codegnan.threads;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"-----"
	+Thread.currentThread().getPriority());

		MyRunnable r=new MyRunnable();
		Thread th1=new Thread(r);
		System.out.println(th1.getName()+"----"+th1.getPriority());
		th1.setName("malli");
		th1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(th1.getName()+"----"+th1.getPriority());
		
	}

}
