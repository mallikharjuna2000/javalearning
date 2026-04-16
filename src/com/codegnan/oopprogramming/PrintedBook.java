package com.codegnan.oopprogramming;

public class PrintedBook extends Book {
	double finePerDay;

	public PrintedBook(int bookId, String title, String author, double finePerDay) {
		super(bookId, title, author);
		this.finePerDay = finePerDay;
		// TODO Auto-generated constructor stub
	}

	public void showFine(int daysLate) {
		double fine = calculateFine(daysLate, finePerDay);
   System.out.println("Fine "+fine);
	}

}
