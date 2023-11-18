public class SameCharactersCheck {
    public static boolean areSameCharacters(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bca";

        if (areSameCharacters(str1, str2)) {
            System.out.println("The two strings are created with the same characters.");
        } else {
            System.out.println("The two strings are not created with the same characters.");
        }
    }
}
