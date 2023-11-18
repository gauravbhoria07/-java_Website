public class RemoveWhiteSpaces {
    public static String removeWhiteSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String inputStr = "Remove all the spaces";
        String result = removeWhiteSpaces(inputStr);
        System.out.println("String after removing white spaces: " + result);
    }
}
