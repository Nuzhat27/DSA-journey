class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int total = 0 ;
        for(int n : nums)total += n;
        if(total % k != 0 )return false;
        int target = total / k;
        
        Arrays.sort(nums);
        reverse(nums);

        if(nums[0] > target) return false;
        int[] bucket = new int[k];
        return backtrack(nums, 0 , bucket, target);
    }
    private void reverse(int[] nums){
        int left = 0 , right = nums.length - 1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left ++;
            right --;
        }
    }
    private boolean backtrack(int[] nums, int index, int[] bucket, int target){
        if(index == nums.length){
            return true;//Every number has been placed in the bucket
        }
        int n = nums[index];
        for(int i = 0 ; i < bucket.length ; i ++){
            if(bucket[i] + n > target)continue;
            bucket[i] += n;
            if(backtrack(nums, index + 1, bucket, target))return true;
            bucket[i] -= n;
        }
        return false;
    }
}