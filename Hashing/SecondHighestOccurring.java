//Second Highest Occurring ELement
class SecondHighestOccurring {
    public int secondMostFrequentElement(int[] nums) {
     Map<Integer , Integer > mpp = new HashMap<>();
     for(int num : nums){
        mpp.put(num , mpp.getOrDefault(num , 0) + 1);
     }
     int freq1 = 0 , maxEle = -1 , freq2 = 0 , secondMaxEle = -1 ;
     for(var entry : mpp.entrySet()){
        int freq = entry.getValue();
        int el = entry.getKey();
        if(freq > freq1) {
            freq2 = freq1;
            secondMaxEle = maxEle;
            freq1 = freq;
            maxEle = el;
        }
        else if(freq == freq1){
            maxEle = Math.min(el , maxEle);
        }
        else if(freq == freq2){
            secondMaxEle = Math.min(el , secondMaxEle);
        }
        else if(freq < freq1 && freq > freq2){
            freq2 = freq;
            secondMaxEle = el;
        }
     }
     return secondMaxEle;
    }
}

