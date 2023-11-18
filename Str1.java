 class CheckDigits {
    public static boolean containsOnlyDigits(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "12345";
        if (containsOnlyDigits(input)) {
            System.out.println("String contains only digits.");
        } else {
            System.out.println("String contains non-digit characters.");
        }
    }
}
