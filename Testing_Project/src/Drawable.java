interface Drawable {
    void draw();
}

abstract class Shape implements Drawable {
    abstract void area(); // Abstract class-specific method
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void area() {
        System.out.println("Circle Area = πr²");
    }

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.area();
    }
}