public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello, World!";
        char charToRemove = 'l';

        String result = input.replaceAll(String.valueOf(charToRemove), "");

        System.out.println("Original String: " + input);
        System.out.println("String after removing '" + charToRemove + "': " + result);
    }
}
