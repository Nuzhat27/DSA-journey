class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n + 1];
        dp[n] = 0;
        for(int i = n - 1 ; i >= 0; i --){
            int oneStep = (i + 1 <= n) ? dp[i + 1] + costs[i] + 1: Integer.MAX_VALUE; 
            int twoStep = (i + 2 <= n) ? dp[i+2] + costs[i+1] + 4: Integer.MAX_VALUE; 
            int threeStep = (i + 3 <= n) ? dp[i+3] + costs[i+2] + 9 : Integer.MAX_VALUE; 
            dp[i] = Math.min(oneStep,Math.min(twoStep, threeStep));
        }
        return dp[0];
    }
}