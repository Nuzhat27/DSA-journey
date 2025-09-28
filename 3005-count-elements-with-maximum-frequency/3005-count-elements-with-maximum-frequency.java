class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int maxFrequency = 0;
        HashMap<Integer , Integer> mpp = new HashMap<>();
        for(int num : nums){
            mpp.put(num , mpp.getOrDefault(num , 0) + 1);
            maxFrequency = Math.max(mpp.get(num) , maxFrequency);
        }
        int totalFrequency = 0;
        for (int frequency : mpp.values()) {
            if (frequency == maxFrequency) {
                totalFrequency += frequency;
            }
        }
        return totalFrequency;

    }
}