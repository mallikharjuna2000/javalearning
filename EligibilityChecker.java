package com.codegnan;

import java.util.Scanner;

public class EligibilityChecker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("=====================================================");
		System.out.println("    ELIGIBILITY CHECKING SYSTEM                     ");
		System.out.println("=====================================================");
		System.out.println();
		System.out.print("Enter your name : ");
		String name=scanner.nextLine();
		System.out.println("Enter Your Age : ");
		int age=scanner.nextInt();
		System.out.println();
		if(age<1||age>120) {
			System.out.println("Error : please Enter a valid age (1-120)");
		}else {
			System.out.println("=====================================================");
			System.out.println("             ELIGIBILITY REPORT                      ");
			System.out.println("=====================================================");
			System.out.printf("Name : %s%n",name);
			System.out.printf("Age : %d years%n",age);
			System.out.println("------------------------------------------------------");
			if(age>=5&&age<=18) {
				System.out.println("[ELIGIBLE] Schoold Education");
			}else {
				System.out.println("[NOT ELIGIBLE] Schoold Education");
			}
			if(age>=18) {
				System.out.println("[ELIGIBLE] Voting Rights");
			}else {
				int yearsLeft=18-age;
				System.out.println("[NOT ELIGIBLE] Voting Rights "
				+"( Eligible in "+yearsLeft+"year(s)");
			}
			if(age>=18) {
				System.out.println("[ELIGIBLE] Driving License");
			}else {
				int yearsLeft=18-age;
				System.out.println("[NOT ELIGIBLE] Driving License "
				+"( Eligible in "+yearsLeft+"year(s)");
			}if(age>=60) {
				System.out.println("[ELIGIBLE] Senior Citizen");
			}else {
				int yearsLeft=60-age;
				System.out.println("[NOT ELIGIBLE] Senior Citizen "
				+"( Eligible in "+yearsLeft+"year(s)");
			}
			System.out.println("=======================================================");
	
		}
		scanner.close();

	}

}
