package com.codegnan;

import java.util.Scanner;
public class AutomorphicNumber {
   public static void main(String[] args) {
       // Create Scanner object to take input
       Scanner sc = new Scanner(System.in);
       // Read number from user
       int num = sc.nextInt();
       // Calculate square of the number
       int square = num * num;
       // Store original number in temp for comparison
       int temp = num;
       // ============================================
       // LOOP: Compare digits from right to left
       // ============================================
       while (temp > 0) {
           // Get last digit of original number
           int digitNum = temp % 10;
           // Get last digit of square
           int digitSquare = square % 10;
           // Compare digits
           if (digitNum != digitSquare) {
               // If any digit is not matching → Not Automorphic
               System.out.println("Not Automorphic");
               // Exit immediately
               return;
           }
           // Remove last digit from both numbers
           temp /= 10;
           square /= 10;
       }
       // If all digits matched → Automorphic
       System.out.println("Automorphic");
       sc.close();
   }
}


