package com.codegnan;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		// Create Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		// Read the number
		int num = sc.nextInt();
		// Calculate square of the number
		int square = num * num;
		// Variable to store sum of digits of square
		int sum = 0;
		// ============================================
		// LOOP: Find sum of digits of square
		// ============================================
		while (square != 0) {
			// Extract last digit of square
			int digit = square % 10;
			// Add digit to sum
			sum += digit;
			// Remove last digit
			square /= 10;
		}
		// ============================================
		// CHECK: Compare sum with original number
		// ============================================
		if (sum == num) {
			// If equal → Neon Number
			System.out.println("Neon Number");
		} else {
			// If not equal → Not a Neon Number
			System.out.println("Not Neon Number");
		}
		sc.close();
	}
}
