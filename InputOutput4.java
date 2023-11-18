import java.util.Scanner;

 class FloatInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a float:");
        float num = scanner.nextFloat();
        System.out.println("You entered: " + num);
    }
}
