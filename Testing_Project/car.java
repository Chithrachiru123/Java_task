public class car {
    string color;
    String model;
    int year;

    public void setSpeed(int speed){
        int maxSpeed = 120;
        System.out.println("setting speed to " + speed + "(max:" + maxSpeed + ")");
    }


    public static void displayCarInfor() {

        System.out.println("car model: " + model +, "year:" + year +, "color: " + color);

    }

    public static void main(String[] args) {
        car myCar = new car();
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar.year = 2024;

        myCar.displayCarInfor();
    }
}

