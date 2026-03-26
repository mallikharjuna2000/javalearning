package com.codegnan;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		// Create Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		// Read input number
		int num = sc.nextInt();
		// Variable to store sum of digits
		int sum = 0;
		// Variable to store product of digits
		int product = 1;
		// ============================================
		// LOOP: Process each digit of the number
		// ============================================
		while (num != 0) {
			// Extract last digit
			int digit = num % 10;
			// Add digit to sum
			sum += digit;
			// Multiply digit to product
			product *= digit;
			// Remove last digit from number
			num /= 10;
		}
		// ============================================
		// CHECK: Compare sum and product
		// ============================================
		if (sum == product) {
			// If both are equal → Spy Number
			System.out.println("Spy Number");
		} else {
			// If not equal → Not a Spy Number
			System.out.println("Not Spy Number");
		}
		sc.close();
	}
}
