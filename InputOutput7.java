import java.util.Scanner;

 class ShortInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a short integer:");
        short num = scanner.nextShort();
        System.out.println("You entered: " + num);
    }
}
