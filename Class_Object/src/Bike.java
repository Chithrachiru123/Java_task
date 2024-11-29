// Subclass: Bike
class Bike extends Vehicle {
    boolean hasCarrier;

    // Constructor
    Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed); // Calling the parent class constructor
        this.hasCarrier = hasCarrier;
    }

    // Method to display bike details
    @Override
    void displayDetails() {
        super.displayDetails(); // Calling the parent class method
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }

    // Unique method for Bike
    void performWheelie() {
        System.out.println("The bike is performing a wheelie!");
    }
}