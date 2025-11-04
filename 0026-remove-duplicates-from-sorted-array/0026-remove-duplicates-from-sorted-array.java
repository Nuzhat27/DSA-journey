class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int l = 0 ;
        for(int i = 1 ; i < n ; i ++){
            if(nums[i] != nums[l]){
                l += 1;
                nums[l] = nums[i];
            }
        }
        return l + 1;//we have to return the k unique elements...last unique element's index is l so number of unique elements = l + 1(since array uses zero-based indexing)
    }
}