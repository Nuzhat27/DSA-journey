class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        int n = strs.length;
        String last = strs[n - 1];
        String ans = "";
        for(int i = 0 ; i < first.length() ; i ++){
            char ch = first.charAt(i);
            char ch2 = last.charAt(i);
            if( ch != ch2)break;
            else {
                ans += ch;
            }
        }
        return ans;
    }
}