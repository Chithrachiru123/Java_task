public class conditionalStatement {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        char operator = '+';
        switch(operator) {

            case '+': {
                int sum = a + b;
                System.out.println(sum);
                break;
            }
            case '-': {
                int sub = a - b;
                System.out.println(sub);
                break;
            }
            case '*': {
                int mul = a * b;
                System.out.println(mul);
                break;
            }
        }
    }
}
