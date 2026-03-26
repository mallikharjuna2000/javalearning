package com.codegnan;

import java.util.Scanner;

public class MissingDigit {
	public static void main(String[] args) {
		// Create Scanner object to take input
		Scanner sc = new Scanner(System.in);
		// Read the number from user
		int num = sc.nextInt();
		// Get the last digit (rightmost digit)
		int prev = num % 10;
		// Remove last digit
		num /= 10;
		// ============================================
		// LOOP: Compare adjacent digits
		// ============================================
		while (num != 0) {
			// Get current digit
			int curr = num % 10;
			// Check if there is a gap between digits
			// Example: prev = 5, curr = 3 → gap exists (4 is missing)
			if (prev - curr > 1) {
				// Missing digit will be curr + 1
				System.out.println("Missing digit = " + (curr + 1));
				// Exit program immediately after finding first missing digit
				return;
			}
			// Update prev to current digit for next comparison
			prev = curr;
			// Remove last digit
			num /= 10;
		}
		// If no missing digit found
		System.out.println("No missing digit");
		sc.close();
	}
}
