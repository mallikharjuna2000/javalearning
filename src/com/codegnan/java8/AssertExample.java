package com.codegnan.java8;

public class AssertExample {

	public static void main(String[] args) {
		int marks=100;
		assert(marks<200):"marks cannot exceed 200"+marks;
		System.out.println("marks : "+marks);

	}

}
