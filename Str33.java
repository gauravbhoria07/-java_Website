public class IterateOverCharacters {
    public static void iterateOverCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            System.out.println("Character at index " + i + ": " + character);
        }
    }

    public static void main(String[] args) {
        String inputStr = "Iteration";
        iterateOverCharacters(inputStr);
    }
}
