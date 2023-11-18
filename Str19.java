public class DivideString {
    public static String[] divideString(String str, int parts) {
        int len = str.length();
        int partLength = len / parts;
        String[] dividedStrings = new String[parts];

        for (int i = 0; i < parts; i++) {
            int start = i * partLength;
            int end = (i == parts - 1) ? len : (i + 1) * partLength;
            dividedStrings[i] = str.substring(start, end);
        }

        return dividedStrings;
    }

    public static void main(String[] args) {
        String input = "abcdefghij";
        int parts = 3;

        String[] result = divideString(input, parts);

        System.out.println("Divided Strings: " + Arrays.toString(result));
    }
}
