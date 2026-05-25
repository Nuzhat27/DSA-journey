class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        /*int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i = 1 ; i < n ; i ++){
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }*/
        HashMap<Integer , Integer> mpp = new HashMap<>();
        mpp.put(0 , 1);
        int count = 0 , curPrefixSum = 0;
        for(int i = 0 ; i < n ; i ++){
            curPrefixSum += nums[i];
            int sumToRemove = curPrefixSum - k;
            count += mpp.getOrDefault(sumToRemove , 0);
            mpp.put(curPrefixSum , mpp.getOrDefault(curPrefixSum , 0) + 1);
        }
        return count;
    }
}