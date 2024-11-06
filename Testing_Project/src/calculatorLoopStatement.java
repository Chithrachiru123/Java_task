import java.util.Scanner;
public class calculatorLoopStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // For loop implementation
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            int result;
            switch (operator) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error! Division by zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }
            System.out.println("Result: " + result);
        }

    }
}
