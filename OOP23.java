// StudentInfo.java
import java.util.Scanner;

public class StudentInfo {
    private int rollNo;
    private String name;
    private String className;

    private static int rollNoCounter = 1;

    public StudentInfo(String name, String className) {
        this.name = name;
        this.className = className;
        this.rollNo = rollNoCounter++;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter class for student " + (i + 1) + ": ");
            String className = scanner.nextLine();

            StudentInfo student = new StudentInfo(name, className);
            student.displayInfo();
            System.out.println();
        }

        scanner.close();
    }
}
