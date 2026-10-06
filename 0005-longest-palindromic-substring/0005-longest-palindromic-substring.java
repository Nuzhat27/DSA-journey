class Solution {
    public String longestPalindrome(String s) {
        StringBuilder st = new StringBuilder();
        st.append("^").append("#");
        for(char c : s.toCharArray()){
            st.append(c).append("#");
        }
        st.append("$");
        int n = st.length();
        int c = 0, r = 0;
        int[] p = new int[n];
        for(int i = 1; i < n -1 ; i ++){
            int mirror = c * 2 - i;
            if(i < r){
                p[i] = Math.min(r - i, p[mirror]);
            }
            while(st.charAt(i - p[i] - 1) == st.charAt(i + p[i] + 1)){
                p[i] ++;
            }
            if(i + p[i] > r){
                r = i + p[i];
                c = i;
            }
        }
        int maxLen = 0, centreIndex = 0;
        for(int i = 0 ; i < n; i ++){
            if(p[i] > maxLen){
                maxLen = p[i];
                centreIndex = i;
            }
        }
        int start = (centreIndex - maxLen)/ 2;
        return s.substring(start, start + maxLen);

    }
}