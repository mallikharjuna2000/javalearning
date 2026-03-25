package com.codegnan;

import java.util.Scanner;

/**
 * GradeChecker — Marks to Grade and Remark Mapper.
 *
 * Demonstrates: - Slab-based range checking with nested if-else - Input
 * validation (0–100) - Multiple output fields derived from a single input
 *
 * Connected to Day 4: the same grade logic will be rebuilt using switch on
 * pre-calculated ranges to compare readability.
 *
 * @author Codegnan IT Solutions
 * @version 1.0
 */
public class GradeChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("==========================================");
		System.out.println("         STUDENT GRADE CHECKER           ");
		System.out.println("==========================================");
		System.out.println();

		System.out.print("Enter student name : ");
		String name = scanner.nextLine();

		System.out.print("Enter marks obtained (0-100) : ");
		int marks = scanner.nextInt();

		System.out.println();

		if (marks < 0 || marks > 100) {
			System.out.println("Error: Marks must be between 0 and 100.");
		} else {
			char grade;
			String remark;
			String status;

			if (marks >= 90) {
				grade = 'A';
				remark = "Excellent — outstanding performance!";
				status = "PASS";
			} else {
				if (marks >= 80) {
					grade = 'B';
					remark = "Very Good — above average performance.";
					status = "PASS";
				} else {
					if (marks >= 70) {
						grade = 'C';
						remark = "Good — average performance.";
						status = "PASS";
					} else {
						if (marks >= 60) {
							grade = 'D';
							remark = "Satisfactory — needs improvement.";
							status = "PASS";
						} else {
							if (marks >= 50) {
								grade = 'E';
								remark = "Pass — but work harder next time.";
								status = "PASS";
							} else {
								grade = 'F';
								remark = "Fail — must appear for re-examination.";
								status = "FAIL";
							}
						}
					}
				}
			}

			System.out.println("==========================================");
			System.out.println("             GRADE REPORT               ");
			System.out.println("==========================================");
			System.out.printf("%-12s : %s%n", "Name", name);
			System.out.printf("%-12s : %d%n", "Marks", marks);
			System.out.printf("%-12s : %c%n", "Grade", grade);
			System.out.printf("%-12s : %s%n", "Status", status);
			System.out.printf("%-12s : %s%n", "Remark", remark);
			System.out.println("==========================================");
		}

		scanner.close();
	}
}
