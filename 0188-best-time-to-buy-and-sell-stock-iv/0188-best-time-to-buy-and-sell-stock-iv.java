class Solution {
    Integer[][][] dp;
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        dp = new Integer[n][2][k + 1];
        return solve(0 , 1 , k , prices);
        
    }
    public int solve(int i , int buy , int cap , int[] prices){
        if(i == prices.length) return 0;
        if(cap == 0)return 0;
        if(dp[i][buy][cap] != null) return dp[i][buy][cap];
        int profit = 0;
        if(buy == 1){
            profit += Math.max(-prices[i] + solve(i + 1 , 0 , cap , prices) , solve(i + 1 , 1 , cap , prices));
        }
        else{
            profit += Math.max(prices[i] + solve(i + 1 , 1 , cap - 1 , prices) , solve(i + 1 , 0 , cap , prices));
        }
        return dp[i][buy][cap] = profit;
    }
}