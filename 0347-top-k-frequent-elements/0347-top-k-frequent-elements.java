class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int num : nums){
            mpp.put(num, mpp.getOrDefault(num,0) + 1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int key : mpp.keySet()){
            int freq = mpp.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] res = new int[k];
        int indx = 0;
        for(int i = bucket.length - 1 ; i >= 0 && indx < k  ; i --){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    res[indx++] = num;
                    if(indx == k)break;
                }
            }
        }
        return res;
    }
}