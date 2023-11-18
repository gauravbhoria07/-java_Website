// Circle.java
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate area method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate perimeter method
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.0);

        // Using getter methods
        System.out.println("Radius: " + circle.getRadius());

        // Using setter method
        circle.setRadius(6.0);

        // Using other methods
        System.out.println("Updated Area: " + circle.calculateArea());
        System.out.println("Updated Perimeter: " + circle.calculatePerimeter());
    }
}
