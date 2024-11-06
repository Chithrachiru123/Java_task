import java.util.Scanner;

public class calculatorDoWhileStatement {
    public static void main(String[] args) {
        // Using 'do-while' loop to repeat 5 times
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nUsing 'do-while' loop:");
        int i = 0;
        do {
            // Input numbers and operator
            System.out.print("Enter first number (a): ");
            int a = scanner.nextInt();
            System.out.print("Enter second number (b): ");
            int b = scanner.nextInt();
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Perform calculation using switch-case
            switch (operator) {
                case '+':
                    System.out.println("Result: " + a + " + " + b + " = " + (a + b));
                    break;
                case '-':
                    System.out.println("Result: " + a + " - " + b + " = " + (a - b));
                    break;
                case '*':
                    System.out.println("Result: " + a + " * " + b + " = " + (a * b));
                    break;
                case '/':
                    if (b != 0) {
                        System.out.println("Result: " + a + " / " + b + " = " + (a / b));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            }
            i++;
        } while (i < 5);

        scanner.close();
    }
}


