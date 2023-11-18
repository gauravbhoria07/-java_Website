public class SwapCase {
    public static String swapCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String inputStr = "Swap Case Example";
        String result = swapCase(inputStr);
        System.out.println("String after swapping case: " + result);
    }
}
