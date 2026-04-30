package com.codegnan.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Student, Integer> t = new TreeMap<>(new CustomComparator());
		t.put(new Student(1, "malli", 27), 666);
		t.put(new Student(7, "arjun", 17), 111);
		t.put(new Student(5, "neha", 7), 000);
		t.put(new Student(3, "suma", 22), 999);
		System.out.println(t);
		System.out.println("Printing Entries One By One");
		for (Map.Entry<Student, Integer> entry : t.entrySet()) {
			System.out.println(entry.getKey() + "=====>" + entry.getValue());
		}
	}

}
