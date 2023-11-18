 class CurrentDateQualified {
    public static void main(String[] args) {
        // Create a Date object using the fully qualified name
        java.util.Date currentDate = new java.util.Date();

        // Print the current date
        System.out.println("Current Date (qualified): " + currentDate);
    }
}
