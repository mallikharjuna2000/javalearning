package com.codegnan;

import java.util.Scanner;

public class WaterUsageAdjustment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Step 1: Read the number of stations (N) and queries (Q)
		int numberOfStations = sc.nextInt();
		int numberOfQueries = sc.nextInt();
		// Step 2: Read initial water usage for each station
		int[] waterUsage = new int[numberOfStations];
		for (int i = 0; i < numberOfStations; i++) {
			waterUsage[i] = sc.nextInt();
		}
		// Step 3: Process each query (adjustment)
		for (int i = 0; i < numberOfQueries; i++) {
			int startStation = sc.nextInt(); // 1-based index
			int endStation = sc.nextInt(); // 1-based index
			int adjustment = sc.nextInt(); // Positive or negative
			// Apply adjustment to all stations in the range [L, R]
			for (int j = startStation - 1; j < endStation; j++) {
				waterUsage[j] += adjustment;
				// Ensure the usage does not go below zero
				if (waterUsage[j] < 0) {
					waterUsage[j] = 0;
				}
			}
		}
		// Step 4: Display the final water usage for all stations
		for (int i = 0; i < numberOfStations; i++) {
			System.out.print(waterUsage[i]);
			if (i < numberOfStations - 1) {
				System.out.print(" ");
			}
		}
		sc.close();
	}
}
