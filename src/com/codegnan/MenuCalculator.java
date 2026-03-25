package com.codegnan;

import java.util.Scanner;

/**
 * MenuCalculator — Menu-Driven Calculator using switch.
 *
 * Evolves CalculatorV1 (Day 2) by replacing char-operator input
 * with a numbered menu dispatched through a switch statement.
 *
 * Design decisions:
 *   - Outer loop keeps the calculator running until choice 6
 *   - switch dispatches the operation
 *   - Nested if-else handles zero-guard inside division and modulus cases
 *   - Helper method displayResult() is extracted for reuse (Day 4 methods preview)
 *
 * Connected to Week 2: the same calculator will be refactored into
 * separate methods, one per operation, demonstrating DRY principles.
 *
 * @author Codegnan IT Solutions
 * @version 1.0
 */
public class MenuCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("==========================================");
        System.out.println("     MENU-DRIVEN CALCULATOR  V3.0        ");
        System.out.println("==========================================");

        while (running) {
            System.out.println();
            System.out.println("Select operation:");
            System.out.println("  1. Addition       (+)");
            System.out.println("  2. Subtraction    (-)");
            System.out.println("  3. Multiplication (*)");
            System.out.println("  4. Division       (/)");
            System.out.println("  5. Modulus        (%)");
            System.out.println("  6. Exit");
            System.out.println("------------------------------------------");
            System.out.print("Enter choice (1-6): ");
            int choice = scanner.nextInt();//2

            if (choice == 6) {
                System.out.println();
                System.out.println("Thank you for using the calculator. Goodbye!");
                running = false;
            } else {
                if (choice >= 1 && choice <= 5) {
                    System.out.print("Enter first  number: ");
                    double num1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();

                    double  result    = 0;
                    String  operation = "";
                    boolean isValid   = true;

                    switch (choice) {
                        case 1:
                            result    = num1 + num2;
                            operation = "+";
                            break;
                        case 2:
                            result    = num1 - num2;
                            operation = "-";
                            break;
                        case 3:
                            result    = num1 * num2;
                            operation = "*";
                            break;
                        case 4:
                            if (num2 != 0) {
                                result    = num1 / num2;
                                operation = "/";
                            } else {
                                System.out.println("Error: Cannot divide by zero.");
                                isValid = false;
                            }
                            break;
                        case 5:
                            if (num2 != 0) {
                                result    = num1 % num2;
                                operation = "%";
                            } else {
                                System.out.println("Error: Cannot perform modulus by zero.");
                                isValid = false;
                            }
                            break;
                        default:
                            System.out.println("Unexpected error.");
                            isValid = false;
                            break;
                    }

                    if (isValid) {
                        System.out.println("------------------------------------------");
                        System.out.printf("  %.2f %s %.2f = %.2f%n",
                                          num1, operation, num2, result);
                        System.out.println("------------------------------------------");
                    }

                } else {
                    System.out.println("Invalid choice. Please enter 1–6.");
                }
            }
        }

        scanner.close();
    }
}
