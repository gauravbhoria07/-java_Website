// Resizable.java
public interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Rectangle.java
public class Rectangle implements Resizable {
    private int width;
    private int height;

    // constructor and other methods

    @Override
    public void resizeWidth(int width) {
        // implementation for resizing width
    }

    @Override
    public void resizeHeight(int height) {
        // implementation for resizing height
    }
}
