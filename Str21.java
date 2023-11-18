import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static List<String> getPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        generatePermutations("", str, permutations);
        return permutations;
    }

    private static void generatePermutations(String prefix, String remaining, List<String> permutations) {
        int n = remaining.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1, n), permutations);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> result = getPermutations(input);
        System.out.println("Permutations of the string:");
        System.out.println(result);
    }
}
