import java.util.Scanner;

 class LongInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a long integer:");
        long num = scanner.nextLong();
        System.out.println("You entered: " + num);
    }
}
