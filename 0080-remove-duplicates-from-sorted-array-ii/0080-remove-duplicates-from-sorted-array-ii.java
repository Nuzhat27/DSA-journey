class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int l = 0 , r = 0;
        while(r < n){
            int count = 1;
            while(r + 1 < n && nums[r] == nums[r + 1]){
                count += 1;
                r += 1;
            }
            int k = Math.min(2 , count);
            for(int j = 0 ; j < k ; j ++){
                nums[l ++] = nums[r];
            }

            r += 1;
        }
        return l;
    }
}