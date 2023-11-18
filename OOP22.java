// ExampleCopyConstructor.java
public class ExampleCopyConstructor {
    private int value;

    public ExampleCopyConstructor(int value) {
        this.value = value;
    }

    // Copy constructor
    public ExampleCopyConstructor(ExampleCopyConstructor other) {
        this.value = other.value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        ExampleCopyConstructor original = new ExampleCopyConstructor(42);
        ExampleCopyConstructor copy = new ExampleCopyConstructor(original);

        System.out.println("Original value: " + original.getValue());
        System.out.println("Copied value: " + copy.getValue());
    }
}
