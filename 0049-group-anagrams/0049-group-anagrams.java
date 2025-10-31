class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String , List<String>> group = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char ch : s.toCharArray()){
                count[ch - 'a'] ++;
            }
            String key = Arrays.toString(count);
            group.putIfAbsent(key , new ArrayList<>());
            group.get(key).add(s);
        }
        return new ArrayList<>(group.values());
    }
}