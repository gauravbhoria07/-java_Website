import java.util.Scanner;

 class DoubleInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double:");
        double num = scanner.nextDouble();
        System.out.println("You entered: " + num);
    }
}
