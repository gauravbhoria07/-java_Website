public class AddCharactersToString {
    public static void main(String[] args) {
        // Original String
        String originalString = "Hello";

        // Characters to add
        char char1 = ' ';
        char char2 = 'W';

        // Using StringBuilder to add characters
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Adding characters
        stringBuilder.append(char1);
        stringBuilder.append(char2);

        // Resulting String
        String resultString = stringBuilder.toString();

        // Displaying the result
        System.out.println("Original String: " + originalString);
        System.out.println("Characters to add: '" + char1 + "' and '" + char2 + "'");
        System.out.println("String after adding characters: " + resultString);
    }
}
