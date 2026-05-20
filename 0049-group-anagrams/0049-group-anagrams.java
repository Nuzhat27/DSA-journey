class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> mpp = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedString = Arrays.toString(arr);
            mpp.putIfAbsent(sortedString  , new ArrayList<>());
            mpp.get(sortedString).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}