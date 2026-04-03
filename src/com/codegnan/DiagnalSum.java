package com.codegnan;

import java.util.Scanner;

public class DiagnalSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// step1 : Read matrix size
		int rows = scanner.nextInt();// 2
		int cols = scanner.nextInt();// 2

		int[][] arr = new int[rows][cols];// [2][2]

		// step2 : input matrixc elements
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = scanner.nextInt();// 1 2 3 4
			}
		} // [1 2]
			// [3 4]
		int sum = 0;

		// step3 : Traverse Diagnol elements(i==j)
		for (int i = 0; i < rows; i++) {// 0<2
			sum = sum + arr[i][i];// add diagonal element//0+1=>1
		}
		System.out.println(sum);
		scanner.close();
	}

}
