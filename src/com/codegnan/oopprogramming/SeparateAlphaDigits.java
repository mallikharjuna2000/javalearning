package com.codegnan.oopprogramming;

public class SeparateAlphaDigits {

    public static void main(String[] args) {

        // Input string
        String str = "Subbu123raj";

        // Call method
        separateAlphaAndDigits(str);
    }

    // Method to separate alphabets and digits
    public static void separateAlphaAndDigits(String str) {

        // Strings to store results
        String letters = "";
        String digits = "";

        // Step 1: Traverse each character in the string
        for (int i = 0; i < str.length(); i++) {

            // Get current character
            char ch = str.charAt(i);

            // Step 2: Check if character is an alphabet (A-Z or a-z)
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

                // Add to letters string
                letters = letters + ch;

            }
            // Step 3: Check if character is a digit (0-9)
            else if (ch >= '0' && ch <= '9') {

                // Add to digits string
                digits = digits + ch;
            }
        }

        // Step 4: Print results
        System.out.println("Alphabets: " + letters);
        System.out.println("Digits: " + digits);
    }
}