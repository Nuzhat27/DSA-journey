class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n == 1)return nums[0];

        while(nums.length >= 2){
            int[] newNums = new int[nums.length-1];
            for(int i = 0 ; i < nums.length - 1; i ++){
                newNums[i] = (nums[i] + nums[i+1]) % 10;
            }
            int[] temp = nums;
            nums = newNums;
            newNums = temp;
        }
        return nums[0];
    }
}