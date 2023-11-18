// Shape.java
public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Circle.java
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle.java
public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        // Implementation for area calculation
        return 0.0;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        System.out.println("Area of Circle: " + myCircle.calculateArea());
        System.out.println("Perimeter of Circle: " + myCircle.calculatePerimeter());

        Triangle myTriangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Perimeter of Triangle: " + myTriangle.calculatePerimeter());
    }
}
