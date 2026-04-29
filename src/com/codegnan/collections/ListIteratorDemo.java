package com.codegnan.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println("Original List : " + l);
		ListIterator<String> itr = l.listIterator();
		System.out.println("elements in forward Direction");
		while (itr.hasNext()) {
			System.out.print("Next Index : " + itr.nextIndex());
			String s = itr.next();
			System.out.println("  Element " + s);
			if (s.equals("venki")) {
				System.out.println("removing venki");
				itr.remove();
			}
			if (s.equals("chiru")) {
				System.out.println("chiru reeplacing with charan");
				itr.set("charan");
			}
			if (s.equals("nag")) {
				System.out.println("adding pawan after nag");
				itr.add("pawan");
			}
			System.out.println(l);
		}
		System.out.println("Elements in backward Direction ");
		while (itr.hasPrevious()) {
			System.out.print("Next Index : " + itr.previousIndex());
			String s = itr.previous();
			System.out.println("  Element " + s);
		}
	}

}
