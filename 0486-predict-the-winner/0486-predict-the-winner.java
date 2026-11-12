class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
         int[] dp = new int[n];
        //dp[lt][rt] = score of player to move - score of opponent
        //for chunks of length 1
        for(int i = 0 ; i < n ; i ++){
            dp[i] = nums[i];
        }

        //for chunks of length greater than 1
        for(int i = n - 1; i >=0 ; i --){
            for(int j = i + 1; j < n ; j ++){
                int pickLeft = nums[i] - dp[j];
                int pickRight = nums[j] - dp[j-1];
                dp[j] = Math.max(pickLeft, pickRight);
            }
        }
        return dp[n-1] >= 0;
        /*int[][] dp = new int[n][n];
        //dp[lt][rt] = score of player to move - score of opponent
        //for chunks of length 1
        for(int i = 0 ; i < n ; i ++){
            dp[i][i] = nums[i];
        }

        //for chunks of length greater than 1
        for(int len = 2 ; len <= n ; len ++){
            for(int lt = 0 ; lt + len - 1 < n ; lt ++){
                int rt = lt + len - 1;
                dp[lt][rt] = Math.max(nums[lt] - dp[lt+1][rt] , nums[rt] - dp[lt][rt-1]);
            }
        }
        return dp[0][n-1] >= 0;*/
        
    }
}