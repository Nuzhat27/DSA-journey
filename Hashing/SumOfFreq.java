//Sum of Highest and Lowest Frequency
class SumOfFreq {
    public int sumHighestAndLowestFrequency(int[] nums) {
      Map<Integer , Integer> mpp = new HashMap<>();
      for(int num : nums){
        mpp.put(num , mpp.getOrDefault(num , 0) + 1);
      }
      int hfreq = Integer.MIN_VALUE , lfreq = Integer.MAX_VALUE;
      for(var entry : mpp.entrySet()){
        int freq = entry.getValue();
        hfreq = Math.max(freq , hfreq);
        lfreq = Math.min(freq , lfreq);
      }
      return hfreq + lfreq;
    }
}
