class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();
        for (String s : strs) {
            int[] freq = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }
            String key = Arrays.toString(freq);
            mpp.putIfAbsent(key, new ArrayList<>());
            mpp.get(key).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}
