public class InsertStringIntoAnother {
    public static String insertString(String original, String insert, int index) {
        if (index < 0 || index > original.length()) {
            return original; // No insertion for invalid index
        }

        return original.substring(0, index) + insert + original.substring(index);
    }

    public static void main(String[] args) {
        String originalStr = "Java is ";
        String insertStr = "awesome!";
        int index = 7;
        String result = insertString(originalStr, insertStr, index);
        System.out.println("After insertion: " + result);
    }
}
