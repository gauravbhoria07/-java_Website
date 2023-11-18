public class SubsetsOfString {
    public static void printSubsets(String str) {
        int n = str.length();
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder subset = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.append(str.charAt(j));
                }
            }
            System.out.println(subset);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Subsets of the string:");
        printSubsets(input);
    }
}
