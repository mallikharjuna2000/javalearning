import java.util.Scanner;
public class CalculatorV1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("      BASIC CALCULATOR  —  V1.0        ");
        System.out.println("========================================");
        System.out.println();

        System.out.print("Enter first  number : ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter operator (+  -  *  /  %) : ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number : ");
        double number2 = scanner.nextDouble();

        double  result   = 0;
        boolean isValid  = true;

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
                        if (number2 != 0) {
                            result = number1 / number2;
                        } else {
                            System.out.println();
                            System.out.println("Error: Cannot divide by zero.");
                            isValid = false;
                        }
                    } else {
                        if (operator == '%') {
                            if (number2 != 0) {
                                result = number1 % number2;
                            } else {
                                System.out.println();
                                System.out.println("Error: Cannot perform modulus by zero.");
                                isValid = false;
                            }
                        } else {
                            System.out.println();
                            System.out.println("Error: Unknown operator '" + operator + "'.");
                            isValid = false;
                        }
                    }
                }
            }
        }

        if (isValid) {
            System.out.println();
            System.out.println("========================================");
            System.out.printf("  %.2f %c %.2f = %.2f%n",
                              number1, operator, number2, result);
            System.out.println("========================================");
        }

        scanner.close();
    }
}
