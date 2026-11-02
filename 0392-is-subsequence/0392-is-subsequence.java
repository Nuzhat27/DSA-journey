class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length() , n = t.length();
        if(m > n)return false;
        if(m == 0)return true;
        int i = 0 , j = 0;
        while(i < m && j < n){
            if(s.charAt(i) == t.charAt(j)){
                i ++;
            }
            if(i == m)return true;
            j ++;
        }
        return false;
    }
}