
//non static variables or instances variables
public class program3 {
    int a =500;
    public static void test(){
        System.out.println("from test");
    }

    public static void main(String[] args) {
        program3 ob1 = new program3();
        System.out.println(ob1);
        System.out.println(ob1.a);
        ob1.test();



    }
}
