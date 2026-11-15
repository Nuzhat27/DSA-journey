class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        //dp[i] = cost of reaching the top from this stair
        int[] dp = new int[n+1];
        /*
        dp[n] = 0;
        for(int i = n-1 ; i >= 0 ; i --){
            int oneStep = dp[i+1];
            int twoStep = (i+2 <= n)?dp[i+2]:Integer.MAX_VALUE;
            dp[i] = Math.min(oneStep, twoStep) + cost[i];
        } 
        return Math.min(dp[0], dp[1]);
        */
        int next1 = 0, next2 = 0;
        for(int i = n - 1; i >= 0 ; i --){
            int cur = cost[i] + Math.min(next1, next2);
            next2 = next1;
            next1 = cur;
        }
        return Math.min(next1, next2);
    }
}