class Solution {
    public void moveZeroes(int[] nums) {
        int zeroPointer = 0 , n ;
        n = nums.length;
        for(int i = 0 ; i < n ; i ++){
            if(nums[i] != 0){
                nums[zeroPointer] = nums[i];
                zeroPointer += 1;
            }
        }
        for(int i = zeroPointer ; i < n ; i ++){
            nums[i] = 0;
        }
    }
}