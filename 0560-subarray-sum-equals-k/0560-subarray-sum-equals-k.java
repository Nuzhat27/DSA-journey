class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0,1);

        int curPrefixSum = 0 , subArrayCount = 0;
        for(int i = 0 ; i < n ; i ++){
            curPrefixSum += nums[i];
            int sumToRemove = curPrefixSum - k;
            subArrayCount += prefixSumMap.getOrDefault(sumToRemove , 0);
            prefixSumMap.put(curPrefixSum , prefixSumMap.getOrDefault(curPrefixSum , 0 ) + 1);
        } 
        return subArrayCount;
    }
}