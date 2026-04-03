package com.codegnan;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestSmallestNumberArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size Of The Array : ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enteer the Array Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		// sort the array.
		Arrays.sort(arr);
		int secondSmallest = arr[1];
		// second largets n-2
		int secondLargest = arr[n - 2];
		System.out.println("Second Largest and Second Smallest Elements : " + secondLargest + " " + secondSmallest);
		scanner.close();

	}

}
