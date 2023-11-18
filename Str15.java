public class CountPunctuation {
    public static void main(String[] args) {
        String str = "Hello, World! How are you?";
        int punctuationCount = 0;

        for (char c : str.toCharArray()) {
            if (Character.isPunctuation(c)) {
                punctuationCount++;
            }
        }

        System.out.println("Number of punctuation characters: " + punctuationCount);
    }
}
