package com.codegnan;

import java.util.Scanner;

public class BookFine {
	int daysLate;
	double finePerDay;

	public BookFine(int daysLate, double finePerDay) {
		if (daysLate < 0 || finePerDay < 0) {
			System.out.println("Error : Invalid Input! Day and fine must be non-negative");
		} else {
			this.daysLate = daysLate;
			this.finePerDay = finePerDay;
			double totalFine = daysLate * finePerDay;
			System.out.println("Total Fine : " + totalFine);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Days");
		int days = scanner.nextInt();
		System.out.println("Enter Fine per Day ");
		double fine = scanner.nextDouble();
		BookFine bf = new BookFine(days, fine);
		scanner.close();

	}

}
