class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> mpp = new HashMap<>();
        int l = 0, maxf = 0 , maxLen = 0;
        for(int r = 0 ; r < n ; r ++){
            mpp.put(s.charAt(r) , mpp.getOrDefault(s.charAt(r) , 0) + 1);
            maxf = Math.max(maxf , mpp.get(s.charAt(r)));
            while((r - l + 1) - maxf > k){
                mpp.put(s.charAt(l) , mpp.get(s.charAt(l)) - 1);
                l ++;
            }
            maxLen = Math.max(maxLen , r - l + 1); 
        }
        return maxLen;
    }
}