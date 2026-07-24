class Solution {
    int[][] dp ;
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        List<Character> s = new ArrayList<>();
        dp = new int[n + 1][m + 1];
        generateLCS(str1, str2, n, m, dp);
        int i = n , j = m;
        while(i > 0 && j > 0){
            if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                s.add(str1.charAt(i - 1));
                i --; j --;
            }
            else{
                if(dp[i - 1][j] > dp[i][j - 1]){
                    s.add(str1.charAt(i - 1));
                    i --;
                }
                else{
                    s.add(str2.charAt(j - 1));
                    j --;
                }
            }
        }
        while(i > 0){
            s.add(str1.charAt(i - 1));
             i--;
        }
        while(j > 0){
            s.add(str2.charAt(j - 1));
             j --;
        }
        return reverse(s);
    }
    private void generateLCS(String str1, String str2, int n, int m, int[][] dp){
        for(int i = 0 ; i < n ; i ++)dp[i][0] = 0;
        for(int j = 0 ; j < m ; j ++)dp[0][j] = 0;
        for(int i = 1; i <= n ; i ++){
            for(int j = 1; j <= m ; j ++){
                if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

    }
    private String reverse(List<Character> str){
        int left = 0 , right = str.size() - 1;
        while(left < right){
            char ch = str.get(left);
            str.set(left, str.get(right));
            str.set(right, ch);
            left ++;
            right --;
        }
        String st = "";
        for(int i = 0 ; i < str.size() ; i ++){
            st += str.get(i);
        }
        return st;
    }
}