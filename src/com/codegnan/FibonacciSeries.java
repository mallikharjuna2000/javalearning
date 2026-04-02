package com.codegnan;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Terms in Fibanocci Series ");
		int numberOfTerms = scanner.nextInt();//7
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.println("Fibanocci Series ");
		System.out.print(firstTerm + "  " + secondTerm + "  ");//0 1 1 2 3 5 8
		for (int i = 2; i < numberOfTerms; i++) {//7<7
			int nextTerm = firstTerm + secondTerm;//3+5-->8
			System.out.print(nextTerm + "  ");
			firstTerm = secondTerm;//5
			secondTerm = nextTerm;//s.t=8
		}

		scanner.close();
	}

}
