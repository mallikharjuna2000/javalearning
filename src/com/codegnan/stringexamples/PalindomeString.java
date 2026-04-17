package com.codegnan.stringexamples;

import java.util.Scanner;

public class PalindomeString {

	public static boolean isPalindrome(String s) {//madam
	    s=s.toLowerCase();
		int left = 0;
		int right = s.length() - 1;//4
		while (left < right) {//1<3
			if (s.charAt(left) != s.charAt(right)) {//a!=a
				return false;
			}
			left++;//2
			right--;//2
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A String ");
		String s = scanner.next();//madam
		System.out.println(s + " is Palindome " + isPalindrome(s));
		scanner.close();
	}

}
