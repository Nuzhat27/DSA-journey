class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        int length = strs.length;
        int n = strs[0].length();
        for(int i = 0 ; i < n ; i ++){
            if(strs[0].charAt(i) != strs[length - 1].charAt(i)){
                return strs[0].substring(0 , i);
            } 
        }
        return strs[0];
    }
}