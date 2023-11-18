public class ReverseStringWordByWord {
    public static String reverseWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String inputStr = "Reverse String Word by Word";
        String result = reverseWords(inputStr);
        System.out.println("String after reversing words: " + result);
    }
}
