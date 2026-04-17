package com.codegnan.stringexamples;

import java.util.Scanner;
public class StringSwapper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String str1 = scanner.nextLine();
		System.out.print("Enter second String : ");
		String str2 = scanner.nextLine();
		System.out.println("Beffore Swapping : str1 = " + str1 + " , str2 " + str2);
		// concatenate str1 and str2 and store in str1
		str1 = str1 + str2;// malli+arjun==>malliarjun
		// extract the original str1 by taking substring from 0 to length of str1-
		// length of str2
		str2 = str1.substring(0, str1.length() - str2.length());// 0,4
		// extract the original str2 by taking substring fron length of str2 to end.
		str1 = str1.substring(str2.length());
		// display the values after swapping
		System.out.println("after Swapping : str1 = " + str1 + " , str2 " + str2);
	}
}

