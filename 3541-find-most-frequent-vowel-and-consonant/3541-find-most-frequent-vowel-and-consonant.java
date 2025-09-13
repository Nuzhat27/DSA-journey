class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character , Integer> mpp = new HashMap<>();
        if(s.length() == 0)return 0;
        for(int i = 0 ; i < s.length() ; i ++){
            mpp.put(s.charAt(i) , mpp.getOrDefault(s.charAt(i) , 0) + 1);
        }
        int freqCon = 0 , freqVow = 0;
        for(var entry : mpp.entrySet()){
            char ch = entry.getKey();
            int val = entry.getValue();
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' ||ch == 'u'){
                freqVow = Math.max(freqVow , val);
            }
            else{
                freqCon = Math.max(freqCon , val);
            }
        }
        return freqCon + freqVow;
    }
}