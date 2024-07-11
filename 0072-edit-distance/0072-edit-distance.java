class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        // Create a DP table
        int[][] dp = new int[m + 1][n + 1];
        
        // Initialize base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // Operations to convert word1[0...i-1] to empty string (delete all)
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // Operations to convert empty string to word2[0...j-1] (insert all)
        }
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // No operation needed
                } else {
                    int insert = dp[i][j - 1] + 1; // Insert operation
                    int delete = dp[i - 1][j] + 1; // Delete operation
                    int replace = dp[i - 1][j - 1] + 1; // Replace operation
                    dp[i][j] = Math.min(insert, Math.min(delete, replace));
                }
            }
        }
        
        // Return the minimum operations to convert word1 to word2
        return dp[m][n];
    }
}