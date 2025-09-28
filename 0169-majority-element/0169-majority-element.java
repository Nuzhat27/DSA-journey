class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer , Integer> mpp = new HashMap<>();
        for(int num : nums){
            mpp.put(num , mpp.getOrDefault(num , 0) + 1);
        }
        int freq = 0 , ans = -1 ;
        for(var entry : mpp.entrySet()){
            int val = entry.getValue();
            if(val > freq){
                freq = val;
                ans = entry.getKey();
            }
        }
        return ans;
    }
}