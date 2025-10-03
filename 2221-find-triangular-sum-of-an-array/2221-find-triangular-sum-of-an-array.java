class Solution {
    public int triangularSum(int[] nums) {
        while(nums.length > 1){
            nums = reduceArray(nums);
        }
        return nums[0];
    }
    private int[] reduceArray(int[] nums){
        int[] newNums = new int[nums.length - 1];
        for(int i = 0 ; i < nums.length - 1 ; i ++){
            newNums[i] = (nums[i] + nums[i + 1]) % 10;
        }
        return newNums;
    }
}