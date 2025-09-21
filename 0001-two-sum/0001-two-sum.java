class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> mpp = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i ++){
            int moreNeeded = target - nums[i];
            if(mpp.containsKey(moreNeeded)){
                return new int[]{i , mpp.get(moreNeeded)};
            }
            mpp.put(nums[i] , i);
        }
        return new int[]{-1 , -1};
    }
}