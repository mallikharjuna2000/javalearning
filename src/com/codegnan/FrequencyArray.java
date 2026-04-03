package com.codegnan;

import java.util.Scanner;

public class FrequencyArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Step 1: Read size
		int n = sc.nextInt();//9

		int[] arr = new int[n];

		// Step 2: Read elements
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();// 1 2 3 2 1 4 3 5 1
		}

		// Step 3: Create visited array to track counted elements
		boolean[] visited = new boolean[n];//1

		// Step 4: Traverse each element
		for (int i = 0; i < n; i++) {//3<9

			if (visited[i] == true) {
				// Skip if already counted
			} else {

				int count = 1; // count current element//1 2 3 2 1 4 3 5 1

				// Compare with remaining elements
				for (int j = i + 1; j < n; j++) {//2<9

					if (arr[i] == arr[j]) {//2==3
						count++; // increase count//3
						visited[j] = true; // mark as counted
					} else {
						// not equal → do nothing
					}
				}

				// Step 5: Print result
				System.out.println(arr[i] + " occurs " + count + " times");
			}
		}
		sc.close();
	}
}
