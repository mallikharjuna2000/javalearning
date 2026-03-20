import java.util.Scanner;

/**
 * CalculatorV2 — Calculator with Result Condition Checks.
 *
 * This program:
 * 1. Takes two numbers and an operator from user
 * 2. Performs calculation (+, -, *, /, %)
 * 3. Displays result
 * 4. Checks:
 *    - Whether result is positive/negative/zero
 *    - Whether result is whole number or decimal
 *    - Which input number is greater
 */
public class CalculatorV2 {

    public static void main(String[] args) {

        // Creating Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Displaying title
        System.out.println("========================================");
        System.out.println("      BASIC CALCULATOR  —  V2.0        ");
        System.out.println("========================================");
        System.out.println();

        // Taking first number input
        System.out.print("Enter first  number : ");
        double number1 = scanner.nextDouble();

        // Taking operator input (+, -, *, /, %)
        System.out.print("Enter operator (+  -  *  /  %) : ");
        char operator = scanner.next().charAt(0);

        // Taking second number input
        System.out.print("Enter second number : ");
        double number2 = scanner.nextDouble();

        // Variable to store result
        double result = 0;

        // Flag to check if operation is valid
        boolean isValid = true;

        // Checking operator and performing operation
        if (operator == '+') {
            result = number1 + number2;

        } else {
            if (operator == '-') {
                result = number1 - number2;

            } else {
                if (operator == '*') {
                    result = number1 * number2;

                } else {
                    if (operator == '/') {

                        // Checking division by zero
                        if (number2 != 0) {
                            result = number1 / number2;
                        } else {
                            System.out.println("Error: Cannot divide by zero.");
                            isValid = false;
                        }

                    } else {
                        if (operator == '%') {

                            // Checking modulus by zero
                            if (number2 != 0) {
                                result = number1 % number2;
                            } else {
                                System.out.println("Error: Cannot perform modulus by zero.");
                                isValid = false;
                            }

                        } else {
                            // Invalid operator case
                            System.out.println("Error: Unknown operator.");
                            isValid = false;
                        }
                    }
                }
            }
        }

        // If operation is valid, display result and analysis
        if (isValid) {

            System.out.println();
            System.out.println("========================================");

            // Displaying formatted result (2 decimal places)
            System.out.printf("  %.2f %c %.2f = %.2f%n",
                              number1, operator, number2, result);

            System.out.println("----------------------------------------");

            // Condition Check 1: Result Sign
            if (result > 0) {
                System.out.println("  Result is POSITIVE.");
            } else {
                if (result < 0) {
                    System.out.println("  Result is NEGATIVE.");
                } else {
                    System.out.println("  Result is ZERO.");
                }
            }

            // Condition Check 2: Whole Number Check
            // If result has no decimal part
            if (result == (int) result) {
                System.out.println("  Result is a whole number.");
            } else {
                System.out.println("  Result has a decimal part.");
            }

            // Condition Check 3: Comparing Inputs
            if (number1 > number2) {
                System.out.println("  First input is larger.");
            } else {
                if (number1 < number2) {
                    System.out.println("  Second input is larger.");
                } else {
                    System.out.println("  Both inputs are equal.");
                }
            }

            System.out.println("========================================");
        }

        // Closing scanner (good practice to avoid resource leak)
        scanner.close();
    }
}