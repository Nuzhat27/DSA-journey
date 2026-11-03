class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int MOD = 1_000_000_007;
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = target; j >= 0; j--) {      // downward, so smaller cells are still old
                dp[j] = 0;
                for (int t = 1; t <= k && t <= j; t++)
                    dp[j] = (dp[j] + dp[j - t]) % MOD;
            }
        }
        return dp[target];
    }
}