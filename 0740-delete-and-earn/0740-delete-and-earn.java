class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int MAX_N = 1000001;
        int[] worth = new int[MAX_N];
        
        for(int num : nums)worth[num] += num;

        int[] dp = new int[MAX_N];
        dp[0] = 0; dp[1] = worth[1];

        int best = 0;
        for(int i = 2 ; i < MAX_N ; i ++){
            int take = worth[i] + dp[i-2];
            int skip = dp[i-1];
            dp[i] =  Math.max(take,skip);
            best = Math.max(best, dp[i]);
        }
        return best;
    }
}