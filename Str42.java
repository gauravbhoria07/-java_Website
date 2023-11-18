public class SwapStringsWithoutTemp {
    public static void swapStrings(StringBuilder str1, StringBuilder str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        for (int i = 0; i < Math.max(length1, length2); i++) {
            char char1 = (i < length1) ? str1.charAt(i) : 0;
            char char2 = (i < length2) ? str2.charAt(i) : 0;

            if (i < length1) {
                str1.setCharAt(i, char2);
            }

            if (i < length2) {
                str2.setCharAt(i, char1);
            }
        }
    }

    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder("World");
        
        System.out.println("Before swapping: str1 = " + str1 + ", str2 = " + str2);
        swapStrings(str1, str2);
        System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);
    }
}
