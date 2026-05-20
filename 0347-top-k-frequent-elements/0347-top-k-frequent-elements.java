class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer , Integer> mpp = new HashMap<>();
        for(int num : nums){
            mpp.put(num , mpp.getOrDefault(num , 0 ) + 1);
        }
        List<Integer>[] freq = new List[n + 1];
        for(int i = 0 ; i < freq.length ; i ++){
            freq[i] = new ArrayList<>();
        } 

        for(var entry : mpp.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int ind = 0 ;
        int[] ans = new int[k];           
        for(int i = freq.length - 1 ; i >= 0 && ind < k; i--){
            for(int num : freq[i]){
                ans[ind ++] = num;
                if(ind == k) return ans;
            }
        }
        return ans;
    }
}