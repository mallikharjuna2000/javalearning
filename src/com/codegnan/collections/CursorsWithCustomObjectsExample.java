package com.codegnan.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsWithCustomObjectsExample {

	public static void main(String[] args) {
		Vector<Student> v = new Vector<>();
		v.add(new Student(101, "malli", 70));
		v.add(new Student(110, "arjun", 27));
		v.add(new Student(120, "mani", 19));
		v.add(new Student(111, "suma", 23));
		v.add(new Student(222, "mounika", 25));
		System.out.println(v);
		System.out.println("Enumeration Example");
		Enumeration<Student>e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Itearor example");
		Iterator<Student> itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("List Iteratorr Example ");
		ListIterator<Student>listIterator=v.listIterator();
		System.out.println("Forward Direction");
		while(listIterator.hasNext()) {
		System.out.print("index : "+listIterator.nextIndex()+"   ");
		System.out.println(  listIterator.next());
		}
		System.out.println("backward Direction");
		while(listIterator.hasPrevious()) {
		System.out.print("index : "+listIterator.previousIndex()+"   ");
		System.out.println(  listIterator.previous());
		}
	}

}
