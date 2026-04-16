package com.codegnan;

public class OverloadDemo {
	public void test() {
		System.out.println("No Parameters");
	}

	

	public void test(int a, int b) {
		System.out.println("A and B Values are : " + a + " , " + b);
	}
	public void test(short a) {
		System.out.println("a value is " + a);
	}
	

	public static void main(String[] args) {
      OverloadDemo obj=new OverloadDemo();
     
	}

}
