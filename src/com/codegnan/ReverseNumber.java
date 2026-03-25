package com.codegnan;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number = scanner.nextInt();//123
		int originalNumber = number;
		int reverseNumber = 0;
		while (number != 0) {//1!=0
			int lastDigit = number % 10;//1%10-->1
			reverseNumber = reverseNumber * 10 + lastDigit;//3*10+2-->32-->32*10+1-->321
			number /= 10;//1/10-->0
		}
		System.out.println("Reverse of a Number " + originalNumber + " is = " + reverseNumber);
	scanner.close();
	}

}
