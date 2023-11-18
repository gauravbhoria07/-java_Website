import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {
    public static void findDuplicateWords(String str) {
        String[] words = str.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for (String word : words) {
            if (!uniqueWords.add(word)) {
                duplicateWords.add(word);
            }
        }

        System.out.println("Duplicate words in the string:");
        System.out.println(duplicateWords);
    }

    public static void main(String[] args) {
        String input = "Java is a programming language. Java is widely used.";
        findDuplicateWords(input);
    }
}
