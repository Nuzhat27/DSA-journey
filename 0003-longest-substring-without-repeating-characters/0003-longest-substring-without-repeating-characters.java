class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0,left = 0;
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        for(int right = 0 ; right < s.length() ; right ++){
            char c = s.charAt(right);
            if(lastIndex.containsKey(c)){
                left = Math.max(left, lastIndex.get(c) + 1);
            }
            lastIndex.put(c, right);
            maxLength = Math.max(maxLength , right - left + 1);
        }
        return maxLength;
    }
}