package com.codegnan;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Terms in the fibonacci Series : ");
		int numberOfTerms = scanner.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.println("Fibonacci Series : ");
		System.out.print(firstTerm + " " + secondTerm + " ");// 0 1 1 2 3 5
		for (int i = 2; i < numberOfTerms; i++) {
			int nextTerm = firstTerm + secondTerm;// 2
			System.out.print(nextTerm + " ");
			firstTerm = secondTerm;//
			secondTerm = nextTerm;// =
		}
		scanner.close();
	}
}
