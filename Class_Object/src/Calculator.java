//Create a 3 class and have 3 different method overloading.
class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {

        return a + b;
    }

    // Overloaded method to add three numbers
    public int add(int a, int b, int c) {

        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {

        return a + b;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Using overloaded methods
        System.out.println("Sum of two integers: " + calc.add(5, 10));
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.2));
    }
}
