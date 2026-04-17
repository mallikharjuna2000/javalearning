package com.codegnan.stringexamples;

public class PrintDuplicateCharacters {
	public static void main(String[] args) {
		// Input string
		String str = "Hello";
		// Step 1: Traverse each character in the string
		for (int i = 0; i < str.length(); i++) {
			// Count occurrences of current character
			int count = 0;
			// This flag is used to avoid printing duplicates again
			boolean alreadyPrinted = false;
			// Step 2: Check if character is already processed earlier
			for (int k = 0; k < i; k++) {
				if (str.charAt(i) == str.charAt(k)) {
					alreadyPrinted = true; // already handled
					break;
				}
			}
			// If already printed, skip this character
			if (alreadyPrinted) {
				continue;
			}
			// Step 3: Count how many times this character appears
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			// Step 4: If count > 1, it is a duplicate
			if (count > 1) {
				System.out.println(str.charAt(i));
			}
		}
	}
}
