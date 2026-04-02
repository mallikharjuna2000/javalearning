package com.codegnan;

public class DiamondPattern {

	public static void main(String[] args) {
		int rows = 5;
		// part-1 upper part of the diamond(Full Pyramid)
		for (int i = 1; i <= rows; i++) {
			// inner loop1: print leading spaces.
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
       // part-2 lower part of the diamond (Inverted full pyramid)
		for (int i = rows - 1; i >= 1; i--) {
			// inner for loop1 : print leading spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("  ");
			}
			// inner for loop2 print stars
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
