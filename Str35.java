public class PrintEvenLengthWords {
    public static void printEvenLengthWords(String str) {
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        String inputStr = "Print even length words in this sentence";
        printEvenLengthWords(inputStr);
    }
}
