package com.codegnan;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// Create a scanner object to take user input
		Scanner scanner = new Scanner(System.in);
		// Read the input number from the user
		int N = scanner.nextInt();
		// Store the original number to compare later
		int originalNumber = N;
		// Initialize the variable to count the number of digits in the number
		int numDigits = 0;
		// Count the number of digits in the number
		while (N != 0) {
			N /= 10; // Remove the last digit by dividing by 10
			numDigits++; // Increment the digit count
		}
		// Restore the original number after counting digits
		N = originalNumber;
		// Initialize sum to calculate the sum of the powers of digits
		int sum = 0;
		int temp = N; // Copy of the original number for manipulation
		// Loop through each digit of the number and calculate the Armstrong sum
		while (temp != 0) {
			int digit = temp % 10; // Get the last digit of the number
			sum += Math.pow(digit, numDigits); // Raise the digit to the power of numDigits and add to sum
			temp /= 10; // Remove the last digit by dividing by 10
		}
		// Check if the sum of the powers of the digits equals the original number
		if (sum == originalNumber) {
			// If yes, it is an Armstrong number
			System.out.println(originalNumber + " is an Armstrong number");
		} else {
			// If no, it is not an Armstrong number
			System.out.println(originalNumber + " is not an Armstrong number");
		}
		// Close the scanner to prevent resource leakage
		scanner.close();
	}
}

