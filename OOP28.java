// Rectangle.java
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Using getter methods
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());

        // Using setter methods
        rectangle.setLength(7.0);
        rectangle.setWidth(4.0);

        System.out.println("Updated Length: " + rectangle.getLength());
        System.out.println("Updated Width: " + rectangle.getWidth());
    }
}
