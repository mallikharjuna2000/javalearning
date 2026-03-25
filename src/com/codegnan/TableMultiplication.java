package com.codegnan;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Table Number");
		int n=scanner.nextInt();
		for(int i=20;i>=1;i--) {
			System.out.println(+n+"*"+i+"="+(n*i));
		}
		scanner.close();
	}

}
