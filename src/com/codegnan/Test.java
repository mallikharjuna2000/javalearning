package com.codegnan;

class Parent {
	public void methodOne() {
		System.out.println("Method One excuted");
	}
}

class Child extends Parent {
	public void methodTwo() {
		System.out.println("Method 2 executed");
	}
}

public class Test {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		p1.methodOne();
		
		Child c1=new Child();
		c1.methodOne();
		c1.methodTwo();
		
		Parent p2=new Child();
		p1.methodOne();
		
		//Child c2=new Parent();
	}

}
