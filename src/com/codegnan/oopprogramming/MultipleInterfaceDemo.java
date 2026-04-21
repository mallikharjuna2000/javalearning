package com.codegnan.oopprogramming;

public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		// create Human Object
		Human h1=new Human("suma");
		Robot r1=new Robot("R2D2");
		System.out.println("=== Human Daily Routine ===");
		h1.work();
		h1.work();//60
		h1.takeBreak();//70
		h1.eat();//100
		h1.digest();
		h1.work();//
		h1.sleep();
		h1.wakeUp();
		h1.showStatus();
		System.out.println("Robot Operations");
		r1.work();//85
		r1.work();//70
		r1.work();//55
		r1.work();//40
		r1.work();//25
		r1.work();//10
		r1.takeBreak();
		r1.charge();
		r1.work();
	}

}
