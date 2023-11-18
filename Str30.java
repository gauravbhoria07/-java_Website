import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsInFile {
    public static int countWordsInFile(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        int wordCount = 0;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }
        br.close();

        return wordCount;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "sample_text.txt";
        int result = countWordsInFile(filePath);
        System.out.println("Number of words in the file: " + result);
    }
}
