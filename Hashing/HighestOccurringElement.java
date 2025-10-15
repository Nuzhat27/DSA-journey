//Highest Occuring Element in an array
class HighestOccurringElement {
    public int mostFrequentElement(int[] nums) {
     int n = nums.length;
     Map<Integer , Integer > mpp = new HashMap<>();
     for(int num : nums){
        mpp.put(num , mpp.getOrDefault(num , 0) + 1);
     }
     int maxFreq = 0 , maxEle = ;
     for(var entry : mpp.entrySet()){
        int freq = entry.getValue();
        int el = entry.getKey();
        if(freq > maxFreq) {
            maxFreq = freq;
            maxEle = el;
        }
        else if(freq == maxFreq){
            maxEle = Math.min(el , maxEle);
        }
     }
     return maxEle;
    }
}


