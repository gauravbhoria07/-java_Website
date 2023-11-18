// AreaCalculator.java
public class AreaCalculator {
    public double calculateArea(double side) {
        return side * side; // Area of a square
    }

    public double calculateArea(double length, double width) {
        return length * width; // Area of a rectangle
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius; // Area of a circle
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Area of Square: " + calculator.calculateArea(5.0));
        System.out.println("Area of Rectangle: " + calculator.calculateArea(4.0, 6.0));
        System.out.println("Area of Circle: " + calculator.calculateArea(3.0));
    }
}
