package com.codegnan;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// loop until number becomes 1 or 4
		// (4 is known cycle for unhappy numbers)
		while (num != 1 && num != 4) {
			int sum = 0;
			// calculate sum of squares of digits
			while (num != 0) {
				int digit = num % 10;
				sum += digit * digit;
				num /= 10;
			}
			// update number with new sum
			num = sum;
		}
		if (num == 1)
			System.out.println("Happy Number");
		else {
			System.out.println("Not Happy Number");
		}
	sc.close();
	}
}
