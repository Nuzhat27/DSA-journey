class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> mpp = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i ++){
            int moreNeeded = target - nums[i];
            if(mpp.containsKey(moreNeeded)){
                return new int[]{mpp.get(moreNeeded) , i};
            }
            mpp.put(nums[i] , i );
        }
        return new int[]{-1 , -1}; 
    }
}