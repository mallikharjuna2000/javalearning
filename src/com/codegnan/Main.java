package com.codegnan;

public class Main {

	public static void main(String[] args) {

		/*
		 * int[][] a= {{10,20,30},{40,50}}; System.out.println(a[0][0]);
		 * System.out.println(a[0][1]); System.out.println(a[0][2]);
		 * System.out.println(a[1][0]); System.out.println(a[1][1]);
		 * System.out.println(a[1][2]); System.out.println(a[1][3]);
		 */
		int[][][] a = { { { 10, 20, 30 }, { 40, 50 } }, { { 60 }, { 70, 80 }, { 90, 100, 110 } } };
		System.out.println(a[0][1][1]);// 50
		System.out.println(a[1][0][2]);// AIOBE
		System.out.println(a[1][2][1]);// 100
		System.out.println(a[1][2][2]);// 110
		System.out.println(a[2][1][0]);// AIOBE
		System.out.println(a[1][1][1]);// 80

	}

}
