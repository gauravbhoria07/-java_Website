public class SplitIntoSubstrings {
    public static void splitIntoSubstrings(String str, int chunkSize) {
        for (int i = 0; i < str.length(); i += chunkSize) {
            int end = Math.min(i + chunkSize, str.length());
            String substring = str.substring(i, end);
            System.out.println(substring);
        }
    }

    public static void main(String[] args) {
        String inputStr = "SplittingIntoSubstrings";
        int chunkSize = 4;
        splitIntoSubstrings(inputStr, chunkSize);
    }
}
