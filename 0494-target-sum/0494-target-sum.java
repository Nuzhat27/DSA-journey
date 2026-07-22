class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int n : nums)total += n;
        if(total < Math.abs(target) || (total+ target) % 2 != 0)return 0;
        int sum = (total + target) / 2;
        return countSubsetWithGivenSum(nums, sum);
    }

    private int countSubsetWithGivenSum(int[] nums, int sum) {
        int n = nums.length;
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int s = sum; s >= num; s--) {
                dp[s] = dp[s] + dp[s - num];
            }
        }
        return dp[sum];
    }
}