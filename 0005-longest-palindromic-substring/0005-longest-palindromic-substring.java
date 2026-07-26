class Solution {
    public String longestPalindrome(String s) {
        StringBuilder st = new StringBuilder();
        st.append("^").append("#");
        for (char ch : s.toCharArray()) {
            st.append(ch).append("#");
        }
        st.append("$");
        st.toString();
        int n = st.length();
        int[] p = new int[n];
        int r = 0, c = 0;
        for (int i = 1; i < st.length() - 1; i++) {
            int mirror = 2 * c - i;
            if (i < r) {
                p[i] = Math.min(r - i, p[mirror]);
            }
            while(st.charAt(i - p[i] - 1) == st.charAt(i + p[i] + 1)){
                p[i] ++;
            }
            if(i + p[i] > r){
                c = i;
                r = i + p[i];
            }
        } 
        int maxLen = 0 , centreIndex = 0;
        for(int i = 1 ; i < n - 1 ; i ++){
            if(p[i] > maxLen){
                maxLen = p[i];
                centreIndex = i;
            }
        }
        int start = (centreIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}
/*int maxLen = Integer.MIN_VALUE;
int start = 0;
public String longestPalindrome(String s) {
    for(int i = 0 ; i < s.length() ; i ++){
        expand(s, i, i);//for odd length palindromes
        expand(s, i, i + 1);//for even length palindromes
    }
    return s.substring(start, start + maxLen);
}
private void expand(String s, int left, int right){
    while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
        left --;
        right ++;
    }
    int len = right -left - 1;
    if(maxLen < len){
        maxLen = len;
        start = left + 1;
    }
} */
