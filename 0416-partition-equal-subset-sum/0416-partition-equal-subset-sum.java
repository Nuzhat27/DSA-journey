class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int n : nums){
            total += n;
        }

        if(total % 2 != 0){
            //Odd total partition is impossoble
            return false;
        }

        int target = total / 2;

        //1D optimised knapsack
        boolean[] dp = new boolean[target + 1];
        //dp[s] means is it possible to make sum s using the numbers seen so far
        dp[0] = true; // sum zero is possoble for any number seen so far
        for(int num : nums){
            //go right -> left to use numbers once only - 0/1 knapsack requirement
            for(int s = target ; s >= num ; s --){
                dp[s] = dp[s] || dp[s - num];
            }
        }
        return dp[target];
    }
}