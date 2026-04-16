package com.codegnan.oopprogramming;

public class UnderGraduateStudent extends Student {
	public void calculateGrade() {
		super.calculateGrade();
		double marks = getMarks();
		if (marks >= 75) {
			System.out.println("UG Student Grade : Distinction");
		} else {
			if (marks >= 60) {
				System.out.println("UG Student Grade : First Class");
			} else {
				System.out.println("UG Student Grade : Pass");
			}
		}
	}
}
