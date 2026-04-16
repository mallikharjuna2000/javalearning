package com.codegnan.oopprogramming;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student ug=new UnderGraduateStudent();
		System.out.println("Student Id : ");
		ug.setStudentId(sc.nextInt());
		sc.nextLine();
		System.out.println("Name : ");
		ug.setName(sc.nextLine());
		System.out.println("Marks : ");
		ug.setMarks(sc.nextInt());
		ug.calculateGrade();

		Student pg=new PostGraduateStudent();
		System.out.println("Student Id : ");
		pg.setStudentId(sc.nextInt());
		sc.nextLine();
		System.out.println("Name : ");
		pg.setName(sc.nextLine());
		System.out.println("Marks : ");
		pg.setMarks(sc.nextInt());
		pg.calculateGrade();
		sc.close();
	}

}
