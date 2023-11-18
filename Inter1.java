// Shape Interface
interface Shape {
    double getArea();
}

// Rectangle Class
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double getArea() {
        return length * width;
    }
}

// Circle Class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle Class
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

   
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main Class
 class Test{
    public static void main(String[] args) {
        // Creating objects of Rectangle, Circle, and Triangle
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(6, 2);

        // Calculating and printing the areas
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}