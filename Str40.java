public class SeparateCharacters {
    public static void separateCharacters(String str) {
        for (char c : str.toCharArray()) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        String inputStr = "Separate";
        separateCharacters(inputStr);
    }
}
