class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev1 = 0, prev2 = 0;
        for(int num : nums){
            int curr = Math.max(num + prev2 , prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}