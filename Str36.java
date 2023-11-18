public class PalindromeWords {
    public static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void findPalindromeWords(String str) {
        String[] words = str.split("\\s+");
        String smallestPalindrome = null;
        String largestPalindrome = null;

        for (String word : words) {
            if (isPalindrome(word)) {
                if (smallestPalindrome == null || word.length() < smallestPalindrome.length()) {
                    smallestPalindrome = word;
                }
                if (largestPalindrome == null || word.length() > largestPalindrome.length()) {
                    largestPalindrome = word;
                }
            }
        }

        System.out.println("Smallest palindrome word: " + smallestPalindrome);
        System.out.println("Largest palindrome word: " + largestPalindrome);
    }

    public static void main(String[] args) {
        String inputStr = "level civic radar programming deed";
        findPalindromeWords(inputStr);
    }
}
