class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        for(int i = 0 ; i <= n - 2*k ; i ++){
            int j = i + k;
            if(isStrictlyIncreasingSubarray(i , j ,k , nums)){
                return true;
            }
        }
        return false;
    }
    private boolean isStrictlyIncreasingSubarray(int i1 , int i2 ,int k, List<Integer> nums){
        if(i1 + k != i2)return false;
        int end1 = i1 + k - 1;
        for(int i = i1 ; i < end1 ; i ++){
            if(nums.get(i) >= nums.get(i + 1))return false;
        }
        int end2= i2 + k - 1;
        for(int i = i2 ; i < end2 ; i ++){
            if(nums.get(i) >= nums.get(i + 1))return false;
        }
        return true;
    }
}