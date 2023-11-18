import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWord {
    public static String mostRepeatedWord(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        Map<String, Integer> wordCount = new HashMap<String, Integer>();

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                word = word.toLowerCase();
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
        }
        br.close();

        String mostRepeated = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRepeated = entry.getKey();
            }
        }

        return mostRepeated;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "sample_text.txt";
        String result = mostRepeatedWord(filePath);
        System.out.println("Most repeated word in the file: " + result);
    }
}
