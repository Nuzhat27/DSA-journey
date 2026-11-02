class Solution {
    public int maxRepeating(String sequence, String word) {
        int m = sequence.length();
        int n = word.length();

        int k = 0;
        String cur = word;
        while(sequence.contains(cur)){
            k ++;
            cur += word;
        }
        return k;
    }
}