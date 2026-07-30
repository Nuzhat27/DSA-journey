class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int num : nums)
            total += num;
        if (total % 2 != 0)
            return false;
        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int s = target; s >= num ; s--) {
                dp[s] = dp[s] || dp[s - num];
            }
        }
        return dp[target];

        /* 
        boolean[][] dp = new boolean[n + 1][target + 1];
        for(int i = 0 ; i <= n ; i ++){
            for(int j = 0 ; j <= target ; j ++){
                if(i == 0)dp[i][j] = false;
                if(j == 0)dp[i][j] = true;
                if(i > 0){
                    if(nums[i - 1]  <= j){
                        dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                    }
                    else{
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        return dp[n][target];
        */
    }
}