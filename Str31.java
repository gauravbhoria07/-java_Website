public class GetCharacterFromString {
    public static char getCharacter(String str, int index) {
        if (index >= 0 && index < str.length()) {
            return str.charAt(index);
        } else {
            return '\0'; // Return null character for invalid index
        }
    }

    public static void main(String[] args) {
        String inputStr = "Hello, World!";
        int index = 7;
        char result = getCharacter(inputStr, index);
        System.out.println("Character at index " + index + ": " + result);
    }
}
