package com.codegnan;

import java.util.Scanner;

public class SwapDigits {
	public static void main(String[] args) {
		// Create Scanner object to take input
		Scanner sc = new Scanner(System.in);
		// Read the number from user
		int num = sc.nextInt();
		// Store original number in temp (for processing)
		int temp = num;
		// ============================================
		// STEP 1: Get last digit
		// ============================================
		int last = num % 10; // Example: 1234 → last = 4
		// Variables to store first digit and divisor
		int first = 0;
		int divisor = 1;
		// ============================================
		// STEP 2: Find first digit and divisor
		// ============================================
		while (temp >= 10) {
			// Remove last digit
			temp /= 10;
			// Increase divisor (1 → 10 → 100 → 1000...)
			divisor *= 10;
		}
		// After loop, temp contains first digit
		first = temp; // Example: 1234 → first = 1
		// divisor = 1000 (used to place digits correctly)
		// ============================================
		// STEP 3: Extract middle part
		// ============================================
		// Remove first and last digits
		// (num % divisor) removes first digit
		// then /10 removes last digit
		int middle = (num % divisor) / 10;
		// Example:
		// num = 1234
		// num % 1000 = 234
		// middle = 234 / 10 = 23
		// ============================================
		// STEP 4: Rebuild number with swapped digits
		// ============================================
		int result = last * divisor + middle * 10 + first;
		// Explanation:
		// last * divisor → places last digit at first position
		// middle * 10 → keeps middle digits in correct place
		// + first → puts first digit at last position
		// Example:
		// 1234 → 4 * 1000 + 23 * 10 + 1 = 4321
		// ============================================
		// OUTPUT
		// ============================================
		System.out.println("Result = " + result);
		sc.close();
	}
}
