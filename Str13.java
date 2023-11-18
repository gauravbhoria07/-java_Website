public class CountWords {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";

        String[] words = sentence.split("\\s+");
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);
    }
}
