class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer , Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num , count.getOrDefault(num , 0) + 1);
        }

        List<Integer>[] freq = new List[n + 1];
        for(int i = 0 ; i < n + 1 ; i ++){
            freq[i] = new ArrayList<>();
        }

        for(var entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] res = new int[k];
        for(int i = freq.length - 1 ; i >= 0 ; i --){
            for(int m : freq[i]){
                res[index ++] = m;
                if(index == k)return res;
            }
        }
        return res;

    }
}