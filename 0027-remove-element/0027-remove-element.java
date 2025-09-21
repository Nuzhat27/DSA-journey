class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int l = 0;
        for(int i = 0 ; i < n ; i ++){
            if(nums[i] != val){
                nums[l] = nums[i];
                l += 1;
            }
        }
        return l ;
    }
}