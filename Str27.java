public class LargestSmallestWord {
    public static void findLargestAndSmallestWord(String inputStr) {
        String[] words = inputStr.split("\\s+");
        String smallestWord = words[0];
        String largestWord = words[0];

        for (String word : words) {
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        System.out.println("Smallest word: " + smallestWord + ", Largest word: " + largestWord);
    }

    public static void main(String[] args) {
        String inputStr = "This is a sample string with words of different lengths";
        findLargestAndSmallestWord(inputStr);
    }
}
