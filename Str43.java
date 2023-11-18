public class SwapPairs {
    public static String swapPairs(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i += 2) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String inputStr = "SwapPairs";
        String result = swapPairs(inputStr);
        System.out.println("String after swapping pairs: " + result);
    }
}
