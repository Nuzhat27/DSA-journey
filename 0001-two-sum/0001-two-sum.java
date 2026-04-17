class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer , Integer> mpp = new HashMap<>();
        for(int i = 0 ; i < n ; i ++){
            int moreNeeded = target - nums[i];
            if(mpp.containsKey(moreNeeded)) return new int[]{i , mpp.get(moreNeeded)};
            mpp.put(nums[i] , i);
        }
        return new int[]{-1 , -1};
    }
}