package com.codegnan;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		// Create Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		// Read the number
		int num = sc.nextInt();
		// Store original number for comparison later
		int temp = num;
		// Variable to store sum of factorials of digits
		int sum = 0;
		// ============================================
		// LOOP: Process each digit of the number
		// ============================================
		while (temp != 0) {
			// Extract last digit
			int digit = temp % 10;
			// ========================================
			// INNER LOOP: Calculate factorial of digit
			// ========================================
			int fact = 1;
			int i = 1;
			while (i <= digit) {
				// Multiply i to fact (factorial logic)
				fact *= i;
				// Increment i
				i++;
			}
			// Add factorial of digit to sum
			sum += fact;
			// Remove last digit
			temp /= 10;
		}
		// ============================================
		// CHECK: Compare sum with original number
		// ============================================
		if (sum == num) {
			// If equal → Strong Number
			System.out.println("Strong Number");
		} else {
			// If not equal → Not Strong Number
			System.out.println("Not Strong Number");
		}
		sc.close();
	}

}
