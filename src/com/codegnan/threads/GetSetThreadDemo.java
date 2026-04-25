package com.codegnan.threads;

public class GetSetThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
          MyRunnable r=new MyRunnable();
          Thread th=new Thread(r);
          System.out.println(th.getName());
          th.setName("codegnan");
          System.out.println(th.getName());
          Thread th1=new Thread(r);
          System.out.println(th1.getName());
          th1.setName("arjun");
          System.out.println(th1.getName());
	}

}
