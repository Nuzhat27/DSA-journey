class Solution {
    public int waysToReachTarget(int target, int[][] types) {
        int n = types.length;
        int MOD = 1_000_000_007;

        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;

        for(int i = 1; i <= n ; i ++){
            int cnt = types[i - 1][0];
            int mark = types[i - 1][1];

            for(int j = 0 ; j <= target; j ++){
                for(int t = 0 ; t <= cnt && t * mark <= j; t ++){
                    dp[i][j] = (dp[i][j] +  dp[i - 1][j - t * mark]) % MOD;
            }
        }
        }
        return dp[n][target];
    }
}