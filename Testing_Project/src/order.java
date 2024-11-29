
public class order{
    static String customerName;
    static int orderId;
    static char priority;
    static float discount;
    static double totalPrice;

    public static void printDetails() {
        System.out.println("customerName: " + customerName);
        System.out.println("orderId: " + orderId);
        System.out.println("priority:" + priority);
        System.out.println("discount: " + discount);
        System.out.println("totalPrice: " + totalPrice);
    }


    public static void main(String[] args) {

        order myorder = new order();
        myorder.customerName = "bhuvi";
        myorder.orderId = 234;
        myorder.priority = 'H';
        myorder.discount  = 20.5f;
        myorder.totalPrice = 2500;


        myorder.printDetails();


    }
}
