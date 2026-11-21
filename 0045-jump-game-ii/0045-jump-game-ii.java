class Solution {
    public int jump(int[] nums) {
        int n = nums.length;

        //dp[i] = min number of jumps to reach index i
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE/2);
        dp[n-1] = 0;

        for(int i = n-2; i >= 0 ; i --){
            int jump = Math.min(nums[i], n-i-1);
            for(int k = 1 ; k <= jump ; k ++){
                dp[i] = Math.min(dp[i], 1 + dp[i+k]);
            }
        }
        return dp[0];
    }
}