class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        int len = strs[0].length();
        String s1 = strs[0];
        String s2 = strs[n - 1];
        String ans = "";
        for(int i = 0; i < len; i ++){
            if(s1.charAt(i) == s2.charAt(i))ans += s1.charAt(i);
            else break;
        }
        return ans;
    }
}