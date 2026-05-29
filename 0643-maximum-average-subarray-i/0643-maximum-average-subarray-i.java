class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double max = 0 , total = 0;
        for(int i = 0 ; i < k ; i ++){
            total += nums[i];
        }
        max = total / k;
        for(int i = k ; i < n ; i ++){
            total = total + nums[i] - nums[i - k];
            max = Math.max(max , total / k);
        }
        return max;
    }
}