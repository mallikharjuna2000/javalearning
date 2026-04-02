package com.codegnan;

public class ChristmasTreePattern {
	// value 5 is permenetly provided to the height variable.
	public static final int height = 5;
	   // Main Function (starting point of program execution)
	   public static void main(String[] args) {
	       // Assigning initial width of the pyramid
	       int width = 5;
	       // Assigning space value (used for alignment/indentation of tree)
	       int space = width * 5;
	       // Variable to control starting point of inner loop
	       int x = 1;
	       // Loop to print upper part of the tree (multiple pyramids)
	       for (int a = 1; a <= height; a++) {//2<=5
	    	   //inner for loop
	           // Loop to control width of each pyramid level
	           for (int i = x; i <= width; i++) {//1<=5
	               // Loop to print spaces before stars (for center alignment)
	               for (int j = space; j >= i; j--) {
	                   System.out.print(" "); // printing space
	               }
	               // Loop to print stars in each row
	               for (int k = 1; k <= i; k++) {
	                   System.out.print("* "); // printing star with space
	               }
	               // Move to next line after printing one row
	               System.out.println();
	           }
	           // Increasing starting point for next pyramid layer
	           x = x + 2;
	           // Increasing width to make next pyramid wider
	           width = width + 2;
	       }
	       // Printing the trunk (branch) of the Christmas tree
	       for (int i = 1; i <= 4; i++) {
	           // Printing spaces before trunk to center it
	           for (int j = space - 3; j >= 1; j--) {
	               System.out.print(" ");
	           }
	           // Printing stars for trunk (fixed width)
	           for (int k = 1; k <= 4; k++) {
	               System.out.print("* ");
	           }
	           // Move to next line after each trunk row
	           System.out.println();
	       }
	   }
}
