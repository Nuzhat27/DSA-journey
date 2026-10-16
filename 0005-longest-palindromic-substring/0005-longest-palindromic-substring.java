class Solution {
    public String longestPalindrome(String s) {
        StringBuilder st = new StringBuilder();
        st.append("$").append("#");
        for(char c : s.toCharArray()){
            st.append(c).append("#");
        }
        st.append("^");
        int len = st.length();
        int[] p = new int[len];
        int c = 0, r = 0;
        for(int i = 1; i < len - 1; i ++){
            int mirror = 2 * c - i;
            if(i < r){
                p[i] = Math.min(r - i, p[mirror]);
            }
            while(st.charAt(i - p[i] - 1) == st.charAt(i + p[i] + 1))p[i]++;
            if(i + p[i] > r){
                c = i;
                r = i + p[i];
            }
        }
        int centreIndex = 0, maxLen = 0;
        for(int i = 1 ; i < len - 1; i ++){
            if(p[i] > maxLen){
                centreIndex = i;
                maxLen = p[i];
            }
        }
        int start = (centreIndex - maxLen)/2;
        return s.substring(start, start + maxLen);
    }
}