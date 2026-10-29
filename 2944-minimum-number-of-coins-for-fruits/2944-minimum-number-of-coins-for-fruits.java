class Solution {
    public int minimumCoins(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n + 1];
        for(int i = n ; i >= 1; i --){
            if(2 * i >= n)dp[i] = prices[i - 1];
            else{
                int best = Integer.MAX_VALUE;
                for(int j = i + 1; j <= 2 * i + 1; j ++){
                    best = Math.min(dp[j], best);
                }
                dp[i] = prices[i - 1] + best;
            }
        }
        return dp[1];
    }
}