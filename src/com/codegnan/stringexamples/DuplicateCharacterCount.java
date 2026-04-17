package com.codegnan.stringexamples;

public class DuplicateCharacterCount {
	public static int countDuplicates(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					break; // Avoid counting duplicates of the same character multiple times
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "hellaappmmzzrro";
		int duplicateCount = countDuplicates(str);
		System.out.println("Number of duplicates: " + duplicateCount); // Output: 4
	}
}
