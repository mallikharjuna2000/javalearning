package com.codegnan.oopprogramming;

public class Book extends java.lang.Object{
	int bookId;
	String title;
	String author;

	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	public void displayDetails() {
		System.out.println("BooK iD : " + bookId);
		System.out.println("Title : " + title);
		System.out.println("Authorr : " + author);
	}

	public double calculateFine(int daysLate, double finePerDay) {
		return daysLate * finePerDay;
	}

	public double calculateFine(int daysLate) {
		return daysLate * 2;// fixed fine
	}
}
