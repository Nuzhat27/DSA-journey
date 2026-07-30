class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        //dp[i] = minimum cost to climb to the top starting from the ith staircase
        dp[n] = 0;
        for(int i = n - 1; i >= 0 ; i --){
            int next1 = dp[i + 1];
            int next2 = (i + 2 <= n) ? dp[i + 2] : Integer.MAX_VALUE;
            dp[i] = cost[i] + Math.min(next1, next2);
        }
        return Math.min(dp[0],dp[1]);
    }
}