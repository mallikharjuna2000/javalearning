package com.codegnan;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = scanner.nextInt();//123
		int originalNumber = number;//123
		int digitProduct = 1;
		while (number != 0) {//1>0
			int lastDigit = number % 10;//1%10->1
			digitProduct *= lastDigit;//0+3==>3+2-->5+1-->6
			number /= 10;//123/10-->12/10-->1/10-->012
		}
		System.out.println("The sum of digits in a Given Number " + originalNumber + " is =" + digitProduct);
		scanner.close();

	}

}
