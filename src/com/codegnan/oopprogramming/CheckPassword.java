package com.codegnan.oopprogramming;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Password : ");
		String password=scanner.nextLine();
		PasswordChecker simpleChecker=new SimplePasswordChecker();
		System.out.println(simpleChecker.checkLength(password));
		System.out.println(simpleChecker.checkComplexity(password));
		scanner.close();
	}

}
