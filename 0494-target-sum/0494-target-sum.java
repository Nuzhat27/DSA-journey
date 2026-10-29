class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for(int n : nums)total += n;
        if((total + target) % 2 != 0 || total < Math.abs(target))return 0;
        int s1 = (total + target) / 2;
        return countSubsetSum(nums, s1);
    }
    private int countSubsetSum(int[] nums, int target){
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int num : nums){
            for(int s = target; s >= num ; s-- ){
                dp[s] += dp[s - num];
            }
        }
        return dp[target];
    }
}