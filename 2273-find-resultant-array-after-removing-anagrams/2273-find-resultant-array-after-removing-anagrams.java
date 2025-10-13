class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        ArrayList<String> res = new ArrayList<>();
        res.add(words[0]);
        for(int i = 1 ; i < n ; i ++){
            if( ! checkAnagram(words[i] , words[i - 1])){
                res.add(words[i]);
            }
        }
        return res;
    }
    private boolean checkAnagram(String word , String prev){
        int[] freq = new int[26];
        for(char c : word.toCharArray()){
            freq[c - 'a'] += 1;
        }
        for(char c : prev.toCharArray()){
            freq[c - 'a'] -= 1;
        }
        for(int x : freq){
            if(x != 0)return false;
        }
        return true;
    }
}