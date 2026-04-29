package com.codegnan.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		for (int i = 0; i <= 10; i++) {
			v.add(i);
		}
		System.out.println(v);
		Enumeration<Integer> e = v.elements();//0 1 2 3...10
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
	}

}
