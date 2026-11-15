class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        long[][] dp = new long[n][n];
        
        for(int i = 0 ; i < n ; i ++)dp[i][i] = nums[i];

        for(int len = 2; len <= n ; len++){
            for(int lt = 0 ; lt + len - 1 < n; lt++){
                int rt = lt + len - 1;
                dp[lt][rt] = Math.max(nums[lt] - dp[lt+1][rt] , nums[rt] - dp[lt][rt - 1]);
            }
        }
        return dp[0][n-1] >= 0;
    }
}