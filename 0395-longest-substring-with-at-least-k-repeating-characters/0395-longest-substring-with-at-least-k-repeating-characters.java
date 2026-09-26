class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s, k);
    }
    public int helper(String s, int k){
        if(s.length() < k)return 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        // Step 2: find a "bad" character to split on
        for (char c : freq.keySet()) {
            if (freq.get(c) < k) {
                int max = 0;
                // Step 3: split on this character, recurse on each piece
                for (String piece : s.split(String.valueOf(c))) {
                    max = Math.max(max, helper(piece, k));
                }
                return max;
            }
        }

        // Step 4: if we never found a bad character, the whole string is valid
        return s.length();
    }
}