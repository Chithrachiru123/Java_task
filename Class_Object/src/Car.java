// Subclass: Car
class Car extends Vehicle {
    int numberOfDoors;

    // Constructor
    Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed); // Calling the parent class constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car details
    @Override
    void displayDetails() {
        super.displayDetails(); // Calling the parent class method
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    // Unique method for Car
    void turnOnAirConditioner() {
        System.out.println("The air conditioner is turned on.");
    }
}