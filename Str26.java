import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static Map<Character, Integer> charFrequency(String str) {
        Map<Character, Integer> frequency = new HashMap<Character, Integer>();
        for (char c : str.toCharArray()) {
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) + 1);
            } else {
                frequency.put(c, 1);
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        String inputStr = "programming";
        Map<Character, Integer> result = charFrequency(inputStr);
        System.out.println("Character frequency in '" + inputStr + "' is: " + result);
    }
}
