package com.codegnan.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student(101,"malli",27));
		studentList.add(new Student(105,"arjun",37));
		studentList.add(new Student(110,"arun",17));
		studentList.add(new Student(103,"suma",24));
		System.out.println(studentList);
		studentList.add(0,new Student(111,"mahi",28));
		System.out.println(studentList.contains(new Student(101,"malli",27)));

	}

}
