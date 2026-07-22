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
        
}