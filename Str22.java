public class MaxMinOccurringCharacter {
    public static void findMaxMinCharacters(String str) {
        int[] count = new int[256];
        for (char c : str.toCharArray()) {
            count[c]++;
        }

        char maxChar = 0;
        char minChar = 255;

        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                if (count[i] > count[maxChar]) {
                    maxChar = (char) i;
                }
                if (count[i] < count[minChar]) {
                    minChar = (char) i;
                }
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Minimum occurring character: " + minChar);
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        findMaxMinCharacters(input);
    }
}
