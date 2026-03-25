package com.codegnan;

import java.util.Scanner;

/**
 * MonthDaysProgram — Month Number to Days in Month.
 *
 * Demonstrates:
 *   - Intentional fall-through for months sharing day counts
 *   - Nested if-else inside a case (February + leap year check)
 *   - default as error handler
 *
 * @author Codegnan IT Solutions
 * @version 1.0
 */
public class MonthDaysProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("       MONTH DAYS PROGRAM                ");
        System.out.println("==========================================");
        System.out.println();

        System.out.print("Enter month number (1-12)  : ");
        int month = scanner.nextInt();

        System.out.print("Enter year                 : ");
        int year = scanner.nextInt();

        System.out.println();

        if (month < 1 || month > 12) {
            System.out.println("Error: Month must be between 1 and 12.");
        } else {
            String monthName;
            int    days;

            switch (month) {
                case 1:
                    monthName = "January";
                    days      = 31;
                    break;
                case 2:
                    monthName = "February";
                    // Leap year: divisible by 4, but not by 100 unless also by 400
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 3:
                    monthName = "March";
                    days      = 31;
                    break;
                case 4:
                    monthName = "April";
                    days      = 30;
                    break;
                case 5:
                    monthName = "May";
                    days      = 31;
                    break;
                case 6:
                    monthName = "June";
                    days      = 30;
                    break;
                case 7:
                    monthName = "July";
                    days      = 31;
                    break;
                case 8:
                    monthName = "August";
                    days      = 31;
                    break;
                case 9:
                    monthName = "September";
                    days      = 30;
                    break;
                case 10:
                    monthName = "October";
                    days      = 31;
                    break;
                case 11:
                    monthName = "November";
                    days      = 30;
                    break;
                case 12:
                    monthName = "December";
                    days      = 31;
                    break;
                default:
                    monthName = "Unknown";
                    days      = 0;
                    break;
            }

            System.out.println("==========================================");
            System.out.printf("%s %d has %d days.%n", monthName, year, days);
            System.out.println("==========================================");
        }

        scanner.close();
    }
}
