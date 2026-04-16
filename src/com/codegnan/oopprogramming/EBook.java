package com.codegnan.oopprogramming;

public class EBook extends Book {
	

	public EBook(int bookId, String title, String author) {
		super(bookId, title, author);
		// TODO Auto-generated constructor stub
		
	}

	public void showFine(int daysLate) {
		double fine = calculateFine(daysLate);
		System.out.println("EBook Fine : " + fine);

	}

}
