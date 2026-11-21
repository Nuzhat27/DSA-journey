class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
 
        int mx = 0;
        for(int num : nums)mx = Math.max(mx, num);
        int[] worth = new int[mx+1];
        
        for(int num : nums)worth[num] += num;

        int[] dp = new int[mx+1];
        dp[0] = 0; dp[1] = worth[1];

        int best = dp[1];
        for(int i = 2 ; i <= mx ; i ++){
            int take = worth[i] + dp[i-2];
            int skip = dp[i-1];
            dp[i] =  Math.max(take,skip);
            best = Math.max(best, dp[i]);
        }
        return best;
    }
}