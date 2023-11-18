public class DuplicateCharacters {
    public static void findDuplicates(String str) {
        int[] count = new int[256];
        for (char c : str.toCharArray()) {
            count[c]++;
        }

        System.out.println("Duplicate characters in the string:");

        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i);
            }
        }
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        findDuplicates(input);
    }
}
