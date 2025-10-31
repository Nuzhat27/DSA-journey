class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] ans = new int[2];
        int ind = 0;
        for(int i = 1 ; i < n ; i ++){
            if(nums[i] == nums[i - 1]){
                ans[ind ++] = nums[i];
            }
            if(ind == 2) break;
        }
        return ans;
    }
}