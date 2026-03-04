class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
        for(int i = 0 ; i < n ; i ++){
            if(nums[i] != 0){
                nums[left ++] = nums[i];
            }
        }
        for(int i = left ; i < n ; i ++){
            nums[left ++] = 0;
        }
    }
}