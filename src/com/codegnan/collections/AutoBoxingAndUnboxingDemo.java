package com.codegnan.collections;

public class AutoBoxingAndUnboxingDemo {

	public static void main(String[] args) {
		int x=10;//primitive
		Integer y=x;//autoboxing 
		System.out.println("Primitive x "+x);
		System.out.println("Object : "+y);

		Double d=10.5;// wrapper
		double d1=d;// unboxing wrapper to primitive
		System.out.println("Object Double : "+d);
		System.out.println("Primitive double  : "+d1);
	}

}
