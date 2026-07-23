class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;//There's only one way to make 0 amount i.e., take nothing
        for(int coin : coins){
            for(int i = coin ; i <= amount ; i ++){
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}