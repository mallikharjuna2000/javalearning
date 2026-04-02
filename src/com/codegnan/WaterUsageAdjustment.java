package com.codegnan;

import java.util.Scanner;

public class WaterUsageAdjustment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Step 1: Read the number of stations (N) and queries (Q)
		int numberOfStations = sc.nextInt();//5
		int numberOfQueries = sc.nextInt();//2
		// Step 2: Read initial water usage for each station
		int[] waterUsage = new int[numberOfStations];
		for (int i = 0; i < numberOfStations; i++) {
			waterUsage[i] = sc.nextInt();
		}
		// Step 3: Process each query (adjustment)
		for (int i = 0; i < numberOfQueries; i++) {//2<2
			int startStation = sc.nextInt(); // 1-based index//2
			int endStation = sc.nextInt(); // 1-based index//4
			int adjustment = sc.nextInt(); // Positive or negative//10
			// Apply adjustment to all stations in the range [L, R]
			for (int j = startStation - 1; j < endStation; j++) {//j=1;j<4
				waterUsage[j] += adjustment;//5 25 35 50 50 
				// Ensure the usage does not go below zero
				if (waterUsage[j] < 0) {
					waterUsage[j] = 0;
				}
			}
		}
		// Step 4: Display the final water usage for all stations
		for (int i = 0; i < numberOfStations; i++) {//0<5
			System.out.print(waterUsage[i]+" ");//5 25 35 50 50  
			if (i < numberOfStations - 1) {//1<4
				System.out.print(" ");
			}
		}
		sc.close();
	}
}
