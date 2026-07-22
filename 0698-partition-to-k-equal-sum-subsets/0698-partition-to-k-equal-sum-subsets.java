class Solution {
    boolean[] visited;
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int total = 0 ;
        for(int n : nums)total += n;
        if(total % k != 0 )return false;
        int target = total / k;
        visited = new boolean[nums.length];
        return partition(nums, 0 , k, target, 0);
    }
    private boolean partition(int[] nums, int index, int k, int target, int currentSum){
        if(k == 0)return true;
        if(currentSum == target){
            return partition(nums, 0 , k - 1, target, 0);
        }
        for(int i = index ; i < nums.length ; i ++){
            if(!visited[i] && nums[i] + currentSum <= target){
                visited[i] = true;
                if(partition(nums, i + 1, k , target, currentSum + nums[i])){
                    return true;
                }
                visited[i] = false;
            }
        }
        return false;
    }
        /*Arrays.sort(nums);
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
    */
}