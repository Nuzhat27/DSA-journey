class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> mpp = new HashMap<>();
        int maxLen = 0, lt = 0;
        for(int rt = 0 ; rt < n ; rt ++){
            char c = s.charAt(rt);
            if(mpp.containsKey(c)){
                lt = Math.max(lt, mpp.get(c) + 1);
            }
            mpp.put(c, rt);
            maxLen = Math.max(maxLen, rt - lt + 1);
        }
        return maxLen;
    }
}