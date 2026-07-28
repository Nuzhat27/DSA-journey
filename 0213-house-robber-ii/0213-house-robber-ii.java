class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)return nums[0];
        int ans1 = houseRob(nums, 0 , n - 2);
        int ans2 = houseRob(nums, 1, n - 1);
        return Math.max(ans1, ans2);
    }
    private int houseRob(int[] nums, int start, int end){
        int prev1 = 0 , prev2 = 0;
        for(int i = start ; i  <= end ; i ++){
            int curr = Math.max(prev1 , prev2 + nums[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
    /*
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)return nums[0];
        int ans1 = houseRob(nums, 0 , n - 2);
        int ans2 = houseRob(nums, 1, n - 1);
        return Math.max(ans1, ans2);
    }
    private int houseRob(int[] nums, int start, int end){
        int len = end - start + 1;
        if(len == 1)return nums[start];
        int[] dp = new int[len];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start] , nums[start + 1]);
        for(int i = 2 ; i < len ; i ++){
            dp[i] = Math.max(dp[i- 1] , nums[i + start] + dp[i - 2]);
        }
        return dp[len - 1];
    }
} */