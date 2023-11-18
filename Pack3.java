import java.util.Date;

 class CustomDateImport extends Date {
    public static void main(String[] args) {
        // Create an object of the custom class
        CustomDateImport customDate = new CustomDateImport();

        // Print the current date using inherited Date class methods
        System.out.println("Current Date (import & inherit): " + customDate);
    }
}
