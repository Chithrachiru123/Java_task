package Inheritance;

// Main Class to Test
 class VehicleInheritance {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", 180, 4);
        System.out.println("Car Details:");
        car.displayDetails();
        car.start();
        car.turnOnAirConditioner();
        car.stop();

        System.out.println();

        // Create a Bike object
        Bike bike = new Bike("Yamaha", 120, true);
        System.out.println("Bike Details:");
        bike.displayDetails();
        bike.start();
        bike.performWheelie();
        bike.stop();
    }
}