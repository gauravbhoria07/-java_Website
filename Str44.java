import java.util.Scanner;

public class CheckContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (str1.contains(str2)) {
            System.out.println("The first string contains the second string.");
        } else {
            System.out.println("The first string does not contain the second string.");
        }

        scanner.close();
    }
}
