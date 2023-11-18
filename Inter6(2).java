// Drawable.java

// Declare the Drawable interface
interface Drawable {
    // Declare the abstract method "draw" that classes implementing this interface must provide
    void draw();
}

// Circle.java

// Declare the Circle class, which implements the Drawable interface
class Circle implements Drawable {
    // Implement the "draw" method required by the Drawable interface
    public void draw() {
        // Create a new JFrame for displaying the circle
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        // Create a JPanel for custom drawing
        javax.swing.JPanel panel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                // Set the drawing color to red and fill an oval
                g.setColor(java.awt.Color.RED);
                g.fillOval(100, 100, 200, 200);
            }
        };

        // Add the panel to the frame
        frame.add(panel);
    }
}

// Rectangle.java

// Declare the Rectangle class, which implements the Drawable interface
class Rectangle implements Drawable {
    // Implement the "draw" method required by the Drawable interface
    public void draw() {
        // Create a new JFrame for displaying the rectangle
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        // Create a JPanel for custom drawing
        javax.swing.JPanel panel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                // Set the drawing color to blue and fill a rectangle
                g.setColor(java.awt.Color.BLUE);
                g.fillRect(100, 100, 200, 200);
            }
        };

        // Add the panel to the frame
        frame.add(panel);
    }
}

// Triangle.java

// Declare the Triangle class, which implements the Drawable interface
class Triangle implements Drawable {
    // Implement the "draw" method required by the Drawable interface
    public void draw() {
        // Create a new JFrame for displaying the triangle
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        // Create a JPanel for custom drawing
        javax.swing.JPanel panel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                // Set the drawing color to green and fill a polygon
                g.setColor(java.awt.Color.GREEN);
                int[] xPoints = {200, 100, 300};
                int[] yPoints = {100, 300, 300};
                g.fillPolygon(xPoints, yPoints, 3);
            }
        };

        // Add the panel to the frame
        frame.add(panel);
    }
}

// Main.java

// Declare the Main class
public class Main {
    public static void main(String[] args) {
        // Create instances of Drawable objects, which are Circle, Rectangle, and Triangle
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();

        // Call the "draw" method to display each shape
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
