package com.codegnan;

import java.util.Scanner;
public class ReverseEvenDigits {
	public static void main(String[] args) {
		// Create Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		// Read the number from user
		int num = sc.nextInt();
		// Store original number in temp for processing
		int temp = num;
		// This will store reversed EVEN digits only
		int evenRev = 0;
		// ================================
		// STEP 1: Extract and reverse even digits
		// ================================
		while (temp != 0) {
			// Get last digit
			int digit = temp % 10;
			// Check if digit is even
			if (digit % 2 == 0) {
				// Build reversed number of even digits
				evenRev = evenRev * 10 + digit;
			}
			// Remove last digit
			temp /= 10;
		}
		// Example:
		// Input: 123456
		// Even digits: 2,4,6 → reversed → 642
		// ================================
		// STEP 2: Rebuild the number
		// ================================
		int result = 0; // Final result number
		int place = 1; // Keeps track of digit position (1,10,100,...)
		while (num != 0) {
			// Extract last digit from original number
			int digit = num % 10;
			// If digit is even → replace with reversed even digit
			if (digit % 2 == 0) {
				// Take last digit from evenRev
				int lastEven = evenRev % 10;
				// Place it in correct position in result
				result = lastEven * place + result;
				// Remove that digit from evenRev
				evenRev /= 10;
			} else {
				// If odd → keep it as it is
				result = digit * place + result;
			}
			// Move to next position (units → tens → hundreds...)
			place *= 10;
			// Remove last digit from original number
			num /= 10;
		}
		// Print final result
		System.out.println("Result = " + result);
		sc.close();
	}
}


