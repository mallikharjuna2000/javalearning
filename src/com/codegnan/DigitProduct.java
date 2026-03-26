package com.codegnan;

import java.util.Scanner;
public class DigitProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// repeat until number becomes single digit
		while (num >= 10) {
			int product = 1;
			// multiply digits
			while (num != 0) {
				product *= (num % 10);
				num /= 10;
			}
			// update number with product
			num = product;
		}
		System.out.println("Result = " + num);
		sc.close();
	}
}
