package com.codegnan.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Student>pq=new PriorityQueue<>(new MyComparable());
        pq.add(new Student(111,"malli",27));
        pq.add(new Student(10,"ravi",37));
        pq.add(new Student(11,"suresh",17));
        pq.add(new Student(110,"sunny",7));
        pq.add(new Student(120,"mani",24));
        pq.add(new Student(100,"suma",22));
        System.out.println(pq);
        Iterator<Student> itr=pq.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
