public class LongestRepeatingSequence {
    public static String longestRepeatingSequence(String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        int i = n, j = n;
        while (i > 0 && j > 0) {
            if (dp[i][j] == dp[i - 1][j - 1] + 1) {
                result.insert(0, str.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i][j] == dp[i - 1][j]) {
                i--;
            } else {
                j--;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String inputStr = "aabcaabx";
        String result = longestRepeatingSequence(inputStr);
        System.out.println("Longest repeating sequence: " + result);
    }
}
