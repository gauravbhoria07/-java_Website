public class ReverseStringWithoutReverseFunction {
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String inputStr = "Reverse";
        String result = reverseString(inputStr);
        System.out.println("String after reversing: " + result);
    }
}
