public class BitwiseOperators {

        public static void main(String[] args) {
            int a = 5;  // 0101 in binary
            int b = 3;  // 0011 in binary

            System.out.println(a & b);  // 1
            System.out.println(a | b);  // 7
            System.out.println(a ^ b);  // 6
            System.out.println(~a);     // -6
            System.out.println(a << 1); // 10
            System.out.println(a >> 1); // 2
        }
    }

