package Polymorphism;

//Create 3 parent and child class and override the method in each of child class.
// Parent class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
// Child class 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
// Child class 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
    public static void main(String[] args) {
        // Parent reference, child object
        Animal myAnimal;
        myAnimal = new Dog();
        myAnimal.sound(); // Dog's implementation
        myAnimal = new Cat();
        myAnimal.sound(); // Cat's implementation
    }
}