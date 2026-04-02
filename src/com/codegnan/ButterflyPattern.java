package com.codegnan;

public class ButterflyPattern {

	public static void main(String[] args) {
		int rows = 5; // This variable defines the number of rows for ONE WING of the butterfly.
						// The total height of the butterfly will be (rows * 2).

		// ----------------------------------------------------
		// PART 1: Upper part of the butterfly (Expanding wings)
		// ----------------------------------------------------
		for (int i = 1; i <= rows; i++) { // Outer loop: Controls the current row number (from 1 to 'rows')

			// Inner Loop A: Prints stars for the LEFT WING
			// The number of stars increases with 'i' (row number)
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// Inner Loop B: Prints spaces in the MIDDLE GAP
			// The number of spaces decreases as 'i' increases
			// Formula: 2 * (rows - i)
			// Example: if rows=5, i=1 -> 2*(5-1)=8 spaces; i=5 -> 2*(5-5)=0 spaces
			int spaces = 2 * (rows - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			// Inner Loop C: Prints stars for the RIGHT WING
			// The number of stars also increases with 'i'
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println(); // Move to the next line after completing a full row
		}

		// ----------------------------------------------------
		// PART 2: Lower part of the butterfly (Contracting wings)
		// ----------------------------------------------------
		// This loop is a mirror image of the upper part, but 'i' decreases
		// It starts from 'rows' and goes down to 1.
		for (int i = rows; i >= 1; i--) { // Outer loop: Controls the current row number (from 'rows' down to 1)

			// Inner Loop D: Prints stars for the LEFT WING
			// The number of stars decreases with 'i'
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// Inner Loop E: Prints spaces in the MIDDLE GAP
			// The number of spaces increases as 'i' decreases
			// The formula 2 * (rows - i) works here too.
			// Example: if rows=5, i=5 -> 2*(5-5)=0 spaces; i=1 -> 2*(5-1)=8 spaces
			int spaces = 2 * (rows - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			// Inner Loop F: Prints stars for the RIGHT WING
			// The number of stars also decreases with 'i'
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); // Move to the next line
		}
	}

}
/*
 * 1 10 =>1 * * =>2 * * * * =>3 * * * * * * =>4 * * * * * * * * =>5 * * * * * *
 * * * * * =>4 * * * * * * * * =>3 * * * * * * =>2 * * * * =>1 * *
 */
