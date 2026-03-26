package com.codegnan;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		// Create Scanner object for input
		Scanner sc = new Scanner(System.in);
		// Read number from user
		int num = sc.nextInt();
		// Variable to store sum of factors
		int sum = 0;
		// ============================================
		// LOOP: Find factors of the number
		// ============================================
		// We check from 1 to num/2 because:
		// A number cannot have a factor greater than num/2 (excluding itself)
		for (int i = 1; i <= num / 2; i++) {
			// Check if i is a factor of num
			if (num % i == 0) {
				// Add factor to sum
				sum += i;
			}
		}
		// ============================================
		// CHECK: Compare sum with original number
		// ============================================
		if (sum == num) {
			// If equal → Perfect Number
			System.out.println("Perfect Number");
		} else {
			// If not equal → Not Perfect Number
			System.out.println("Not Perfect Number");
		}
		sc.close();
	}
}
