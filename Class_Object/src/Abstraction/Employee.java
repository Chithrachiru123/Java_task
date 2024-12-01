//Group Task: Create any 2 real world example of abstract class and that should have 3 different subclass.
package Abstraction;

abstract class Employee {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method
    abstract void calculateSalary();

    // Concrete method
    void displayDetails() {
        System.out.println("Name: " + name + ", Employee ID: " + employeeId);
    }
}
class Manager extends Employee {
    Manager(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    void calculateSalary() {
        System.out.println("Manager salary includes base salary + bonuses.");
    }
}

class Developer extends Employee {
    Developer(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    void calculateSalary() {
        System.out.println("Developer salary includes base salary + project allowances.");
    }
}

class Intern extends Employee {
    Intern(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    void calculateSalary() {
        System.out.println("Intern salary is based on hourly wages.");
    }

    public static void main(String[] args) {
        Employee manager = new Manager("Chithra", 101);
        Employee developer = new Developer("Savitha", 102);
        Employee intern = new Intern("chiru", 103);

        manager.displayDetails();
        manager.calculateSalary();

        developer.displayDetails();
        developer.calculateSalary();

        intern.displayDetails();
        intern.calculateSalary();
    }
}