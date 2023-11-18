public class ReplaceSpaces {
    public static String replaceSpaces(String str, char replacement) {
        return str.replace(' ', replacement);
    }

    public static void main(String[] args) {
        String inputStr = "Replace spaces with character";
        char replacementChar = '_';
        String result = replaceSpaces(inputStr, replacementChar);
        System.out.println("String after replacing spaces: " + result);
    }
}
