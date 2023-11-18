public class FirstNonRepeatedCharacter {
    public static char findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.containsKey(c) ? charCount.get(c) + 1 : 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // Return null character if there is no non-repeated character
    }

    public static void main(String[] args) {
        String inputStr = "programming";
        char result = findFirstNonRepeatedCharacter(inputStr);
        
        if (result != '\0') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
