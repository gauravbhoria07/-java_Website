import java.util.Scanner;

 class BooleanInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a boolean (true/false):");
        boolean flag = scanner.nextBoolean();
        System.out.println("You entered: " + flag);
    }
}
