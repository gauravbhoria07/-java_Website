// ExampleParameterizedConstructor.java
public class ExampleParameterizedConstructor {
    private int value;

    public ExampleParameterizedConstructor(int value) {
        this.value = value;
        System.out.println("Parameterized constructor with value: " + value);
    }

    public static void main(String[] args) {
        ExampleParameterizedConstructor example = new ExampleParameterizedConstructor(42);
    }
}
