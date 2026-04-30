package com.codegnan.collections;

import java.util.Comparator;

public class MyComparable implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		//return -o1.name.compareTo(o2.name);
		return -Integer.compare(o1.age, o2.age);
	}

	

}
