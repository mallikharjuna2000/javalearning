package com.codegnan.stringexamples;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A String ");
		String s = scanner.next();// arjun
		String reversed = "";
		for (int i = s.length() - 1; i >= 0; i--) {// i=3;3>=0;
			char currentChar = s.charAt(i);// u
			reversed += currentChar;// "nu"
		}
		System.out.println("Revese of A String " + s + " is " + reversed);
		scanner.close();
	}

}
