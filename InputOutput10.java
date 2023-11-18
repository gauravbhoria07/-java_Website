import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class FileStats {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("sample.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int lines = 0;
        int words = 0;
        int characters = 0;
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            lines++;
            characters += line.length();
            words += line.split("\\s+").length; // Assuming words are separated by whitespace
        }

        System.out.println("Number of lines: " + lines);
        System.out.println("Number of words: " + words);
        System.out.println("Number of characters: " + characters);

        bufferedReader.close();
        fileReader.close();
    }
}
