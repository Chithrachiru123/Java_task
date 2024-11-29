// Parent Class: Vehicle
class Vehicle {
    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display vehicle details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    // Method to start the vehicle
    void start() {
        System.out.println("The vehicle is starting...");
    }

    // Method to stop the vehicle
    void stop() {
        System.out.println("The vehicle is stopping...");
    }
}