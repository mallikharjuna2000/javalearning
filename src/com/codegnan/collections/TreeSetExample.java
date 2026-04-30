package com.codegnan.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Student> t = new TreeSet<>(new MyComparator());
		t.add(new Student(111, "malli", 27));
		t.add(new Student(110, "mounika", 17));
		t.add(new Student(101, "suma", 17));
		t.add(new Student(90, "bala", 7));
		t.add(new Student(100, "cherry", 15));
		System.out.println(t);
		Iterator<Student> itr = t.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("HashSet Example");
		LinkedHashSet<Student> h = new LinkedHashSet<>();
		h.add(new Student(111, "malli", 27));
		h.add(new Student(110, "mounika", 17));
		h.add(new Student(101, "suma", 17));
		h.add(new Student(90, "bala", 7));
		h.add(new Student(100, "cherry", 15));
		System.out.println(h);
		Iterator<Student> itr1 = h.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
