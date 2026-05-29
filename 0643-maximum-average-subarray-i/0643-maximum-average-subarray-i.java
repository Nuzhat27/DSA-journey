class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double max = 0 , curSum = 0;
        for(int i = 0 ; i < k ; i ++){
            curSum += nums[i];
        }
        max = curSum;
        for(int i = k ; i < n ; i ++){
            curSum = curSum + nums[i] - nums[i - k];
            max = Math.max(max , curSum);
        }
        return max / k;
    }
}